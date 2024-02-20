package leet.twopointer;

public class WaterContainer {
  public int maxArea(int[] height) {
    int maxArea = 0;
    int i = 0;
    int j = height.length - 1;
    while (i < j) {
      int currentArea = 0;
      currentArea = Math.min(height[i], height[j]) * (j - i);
      maxArea = Math.max(maxArea, currentArea);
      if (height[j] < height[i]) {
        j--;
      } else {
        i++;
      }
    }
    return maxArea;
  }

  public static void main(String[] args) {
    WaterContainer waterContainer = new WaterContainer();
    System.out.println(waterContainer.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
  }
}
