package katas.kuy7;

import java.util.List;
import java.util.Arrays;

public class VowelCount {

  



  public static int getCount(String str) {
    
    List<Character> vowels = Arrays.asList('a','e','i','o','u');

    if (str.isEmpty()) {
      return 0;
    } else {
      return vowels.contains((Character) str.toLowerCase().charAt(0)) ? getCount(str.substring(1)) + 1 : getCount(str.substring(1));
    }
    
    
  }

}