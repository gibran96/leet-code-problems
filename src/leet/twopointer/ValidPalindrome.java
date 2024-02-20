package leet.twopointer;

import java.util.Arrays;

public class ValidPalindrome {
  public boolean isPalindrome(String s) {
    /*s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    char[] arr = s.toCharArray();
    char[] output = new char[arr.length];
    int j = 0;
    for (int i = arr.length-1; i>=0; i--) {
      output[j] = arr[i];
      j++;
    }
    String result = new String(output);
    return result.equals(s);*/
    s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    if (s.isEmpty()) {
      return false;
    }
    int i = 0;
    int j = s.length()-1;
    while (i != j && i < s.length() && j>=0) {
      if (s.charAt(i) != s.charAt(j)) {
        return false;
      }
      i++;
      j--;
    }
    return true;
  }

  public static void main(String[] args) {
    ValidPalindrome validPalindrome = new ValidPalindrome();
    System.out.println(validPalindrome.isPalindrome("aa"));
  }
}
