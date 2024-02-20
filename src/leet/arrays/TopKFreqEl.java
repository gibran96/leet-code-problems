package leet.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopKFreqEl {

  public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int num : nums) {
      if (map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    // sort the map by value in descending order
    /*Map<Integer, Integer> sortedMap = sortHashMapByValues(map);
    System.out.println(sortedMap);
    int[] result = new int[k];
    int i = 0;
    for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
      if (i == k) {
        break;
      }
      result[i] = entry.getKey();
      i++;
    }*/
    //Better solution
    List<List<Integer>> count = new ArrayList<>();
    for (int i = 0; i < nums.length + 1; i++) {
      count.add(new ArrayList<>());
    }
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      count.get(entry.getValue()).add(entry.getKey());
    }
    int[] result = new int[k];
    int j = 0;
    for (int i = count.size() - 1; i >= 0; i--) {
      for (int num : count.get(i)) {
        if (j == k) {
          break;
        }
        result[j] = num;
        j++;
      }
    }

    return result;
  }

  public static LinkedHashMap<Integer, Integer> sortHashMapByValues(HashMap<Integer, Integer> map) {
    List<Entry<Integer, Integer>> list = new LinkedList<>(map.entrySet());

    // Sort the list based on values (in descending order)
    list.sort((o1, o2) -> (o2.getValue()).compareTo(o1.getValue()));

    // Put the sorted entries into a LinkedHashMap to maintain the order
    LinkedHashMap<Integer, Integer> result = new LinkedHashMap<>();
    for (Map.Entry<Integer, Integer> entry : list) {
      result.put(entry.getKey(), entry.getValue());
    }
    return result;
  }

  public static void main(String[] args) {
    TopKFreqEl topKFreqEl = new TopKFreqEl();
    System.out.println(
        Arrays.toString(topKFreqEl.topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2)));
  }
}
