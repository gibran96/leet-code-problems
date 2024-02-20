package leet.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LongConsSeq {

  public int longestConsecutive(int[] nums) {
    HashSet<Integer> arr = new HashSet<>();
    for (int num : nums) {
      arr.add(num);
    }
    int max = 0;
    for (int i : nums) {
      int x = i - 1;
      int curr = 0;
      if (!arr.contains(x)) {
        while (arr.contains(x + 1)) {
          curr += 1;
          x += 1;
        }
        max = Math.max(max, curr);
      }
    }
    return max;
  }

  public static void main(String[] args) {
    LongConsSeq longConsSeq = new LongConsSeq();
    System.out.println(longConsSeq.longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1,
        6}));
  }

}
