package leet;

public class RemoveDuplicates2 {

  /*
    * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most
    * twice and return the new length.
   */
  public int removeDuplicates(int[] nums) {
    int j = 0;
    for (int i = 1; i < nums.length; i++) {
      if (j == 0 || j == 1 || nums[i] != nums[j - 2]) {
        nums[j] = nums[i];
        j++;
      }
    }
    return j;
  }
}
