package leet.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    HashMap<List<Integer>, List<String>> map = new HashMap<>();
    for (String str : strs) {
      char[] charArray = str.toCharArray();
      Arrays.sort(charArray);
      List<Integer> key = new ArrayList<>();
      for (char c : charArray) {
        key.add((int) c);
      }
      if (map.containsKey(key)) {
        map.get(key).add(str);
      } else {
        List<String> list = new ArrayList<>();
        list.add(str);
        map.put(key, list);
      }
    }
    return new ArrayList<>(map.values());
  }

  public static void main(String[] args) {
    String[] arr = new String[]{"eat","tea","tan","ate","nat","bat"};
    GroupAnagrams groupAnagrams = new GroupAnagrams();
    System.out.println(groupAnagrams.groupAnagrams(arr));
  }
}
