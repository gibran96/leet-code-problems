package leet.arrays;

import java.util.Arrays;

public class ProductExcSelf {
  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    Arrays.fill(result, 1);
    int prefix = 1;
    for (int i = 0; i < nums.length; i++) {
      result[i] = prefix;
      prefix = prefix * nums[i];
    }
    int postfix = 1;
    for (int i = nums.length - 1; i > -1; i--) {
      result[i] = result[i] * postfix;
      postfix = postfix * nums[i];
    }
    return result;
  }

  public static void main(String[] args) {
    ProductExcSelf productExcSelf = new ProductExcSelf();
    System.out.println(Arrays.toString(productExcSelf.productExceptSelf(new int[]{1, 2, 3, 4})));
  }
}
