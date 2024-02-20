package leet.twopointer;

import java.util.HashMap;

public class TwoSumSorted {

  public int[] twoSum(int[] numbers, int target) {
    /*for (int i=0; i< numbers.length; i++) {
      for (int j=i+1; j < numbers.length; j++) {
        if (numbers[i] + numbers[j] == target) {
          return  new int[]{i+1, j+1};
        }
        if (numbers[i] + numbers[j] > target) {
          break;
        }
      }
    }
    return new int[]{};*/
    int s = 0;
    int e = numbers.length-1;
    while (true) {
      if (numbers[s] + numbers[e] == target) {
        return new int[]{s+1, e+1};
      }
      if (numbers[s] + numbers[e] > target) {
        e--;
      } else if (numbers[s] + numbers[e] < target) {
        s++;
      }
    }
  }
}
