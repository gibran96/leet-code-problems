package leet.twopointer;

import java.util.Arrays;

/**
 * Leet Code 42: https://leetcode.com/problems/trapping-rain-water/
 */
public class TrappingRainWater {

  public int trap(int[] height) {
    /*int length = height.length;
    int area = 0;
    int[] maxLeft = new int[length];
    int[] maxRight = new int[length];
    for (int i=0; i < length; i++) {
      int[] leftArr = Arrays.copyOfRange(height, 0, i);
      maxLeft[i] = Arrays.stream(leftArr).max().isPresent() ?
          Arrays.stream(leftArr).max().getAsInt() : 0;
    }
    for (int i=length-1; i >=0; i--) {
      int[] rightArr = Arrays.copyOfRange(height, i+1, length);
      maxRight[i] = Arrays.stream(rightArr).max().isPresent() ?
          Arrays.stream(rightArr).max().getAsInt() : 0;
    }

    for (int i=0; i<length; i++) {
      area+= Math.max((Math.min(maxLeft[i], maxRight[i]) - height[i]), 0);
    }

    return area;*/
    if (height.length == 0) {
      return 0;
    }
    int l = 0;
    int r = height.length - 1;
    int leftMax = height[l];
    int rightMax = height[r];
    int area = 0;
    while (l < r) {
      if (leftMax < rightMax) {
        l += 1;
        leftMax = Math.max(leftMax, height[l]);
        area += leftMax - height[l];
      } else {
        r -= 1;
        rightMax = Math.max(rightMax, height[r]);
        area += rightMax - height[r];
      }
    }
    return area;
  }

  public static void main(String[] args) {
    TrappingRainWater trappingRainWater = new TrappingRainWater();
    System.out.println(trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
  }
}
