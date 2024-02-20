package leet.arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class ValidAnagram {
  public boolean isAnagram(String s, String t) {
    //O(1) solution
    char[] sChars = s.toCharArray();
    char[] tChars = t.toCharArray();
    Arrays.sort(sChars);
    Arrays.sort(tChars);
    return Arrays.equals(sChars, tChars);
    /*if (s.length() != t.length()) {
      return false;
    }
    HashMap<Character, Integer> sWord = new HashMap<>();
    HashMap<Character, Integer> tWord = new HashMap<>();
    for (int i = 0; i<s.length(); i++) {
      if (sWord.containsKey(s.charAt(i))) {
        sWord.put(s.charAt(i), sWord.get(s.charAt(i)) + 1);
      } else {
        sWord.put(s.charAt(i), 1);
      }
      if (tWord.containsKey(t.charAt(i))) {
        tWord.put(t.charAt(i), tWord.get(t.charAt(i)) + 1);
      } else {
        tWord.put(t.charAt(i), 1);
      }
    }
    if (sWord.size() != tWord.size()) {
      return false;
    }
    Set<Character> sKeys = sWord.keySet();
    Collection<Integer> sValues = sWord.values();
    Set<Character> tKeys = tWord.keySet();
    Collection<Integer> tValues = tWord.values();
    for (Character c : sKeys) {
      if (!tKeys.contains(c)) {
        return false;
      }
      if (!Objects.equals(sWord.get(c), tWord.get(c))) {
        return false;
      }
    }
    return true;*/
  }

  public static void main(String[] args) {
    ValidAnagram va = new ValidAnagram();
    System.out.println(va.isAnagram("aabbbb", "aaaabb"));
  }

}
