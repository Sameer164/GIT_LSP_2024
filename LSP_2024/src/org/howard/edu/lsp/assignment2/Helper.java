package org.howard.edu.lsp.assignment2;

import java.util.HashMap;

public class Helper {
  public boolean isInteger(String str) {
    try {
      Integer.valueOf(str);
      return true;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public void addToCounts(HashMap<String, Integer> counts, String str) {
    String lowered = str.toLowerCase();
    if (counts.containsKey(lowered)) {
      counts.put(lowered, counts.get(lowered) + 1);
    } else {
      counts.put(lowered, 1);
    }
  }
}
