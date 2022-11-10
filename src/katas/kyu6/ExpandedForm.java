package katas.kyu6;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class ExpandedForm {
    
  public static String expandedForm(int num) {
      
    StringBuilder sb = new StringBuilder();
    Deque<String> numList = new ArrayDeque<String>();
    numList.addAll(Arrays.asList(Integer.toString(num).split("")));

    sb.append(numList.pop() + "0".repeat(numList.size()));

    while (!numList.isEmpty()) {
      if (!numList.peek().equals("0")) {
        sb.append(" + " + numList.pop() + "0".repeat(numList.size()));
      } else {
        numList.removeFirst();
      }
      
    }

    return sb.toString();
  }
}