package leet.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sudoku {

  public boolean isValidSudoku(char[][] board) {
    Map<Integer, Set<Character>> rows = new HashMap<>();
    Map<Integer, Set<Character>> cols = new HashMap<>();
    Map<Integer, Set<Character>> boxes = new HashMap<>();
    // loop through the board and check if the number is already present in the row, column or
    // box set if yes return false else add the number to the set and continue the loop
    for (int i = 0; i < 9; i++) {
      rows.put(i, new HashSet<>());
      cols.put(i, new HashSet<>());
      boxes.put(i, new HashSet<>());
    }
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        char num = board[i][j];
        if (num == '.') {
          continue;
        }
        if (rows.get(i).contains(num) || cols.get(j).contains(num) || boxes.get((i / 3) * 3 + j / 3).contains(num)) {
          return false;
        }
        rows.get(i).add(num);
        cols.get(j).add(num);
        boxes.get((i / 3) * 3 + j / 3).add(num);
      }
    }
    return true;
  }
}
