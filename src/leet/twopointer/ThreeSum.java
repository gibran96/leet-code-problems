package leet.twopointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i<nums.length; i++) {
      if (i > 0 && nums[i] == nums[i-1]) {
        continue;
      }
      int l = i+1;
      int r = nums.length -1;
      while (l<r) {
        int threeSum = nums[i] + nums[l] + nums[r];
        if (threeSum > 0) {
          r--;
        } else if (threeSum < 0) {
         l++;
        } else {
          List<Integer> sum = new ArrayList<>();
          sum.add(nums[i]);
          sum.add(nums[l]);
          sum.add(nums[r]);
          result.add(sum);
          l++;
          while (nums[l] == nums[l-1]) {
            l++;
          }
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    ThreeSum threeSum = new ThreeSum();
    System.out.println(threeSum.threeSum(new int[]{-1,0,1,2,-1,-4}));
  }
}
