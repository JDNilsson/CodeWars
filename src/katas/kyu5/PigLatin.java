package katas.kyu5;

import java.util.Arrays;
import java.util.List;

/*   Move the first letter of each word to the end of it,
    then add "ay" to the end of the word.
  Leave punctuation marks untouched. */

public class PigLatin {


  public static String pigIt(String str) {

    List<String> punctuiationList = Arrays.asList("!","?",".",",");
      
     List<String> newStr = strToList(str).stream()
                      .map(w -> punctuiationList.contains(w)? w : changeWord(w))
                      .toList();
          
    return String.join(" ", newStr);
  }

  //Converts a String to a List to be able to use Java Stream
  private static List<String> strToList(String str) {
    return Arrays.asList(str.split(" "));
  }


  //Moves the first character to the end and adds "ay"
  private static String changeWord(String word) {
    return new StringBuilder(word)
              .append(word.charAt(0)+"ay")
              .deleteCharAt(0)
              .toString();
  }

  public static void main(String[] args) {
    
    System.out.println(PigLatin.pigIt("Tjena gamers nu jävlar smäller det!"));

  }
}