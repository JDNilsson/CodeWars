package katas.kyu6;

import java.util.Arrays;
import java.util.List;

public class SpinWords {

  public String spinWords(String sentence) {
    
    StringBuilder newSentence = new StringBuilder();
    List<String> wordList = sentenceAsList(sentence);
    int i = 0;

    for (String word : wordList) {
      newSentence.append(word.length()>4 ? reversedWord(word) : word);
      if (i++ != wordList.size()) {
        newSentence.append(" ");
      }
    }

    
    return newSentence.toString();
  }

  private List<String> sentenceAsList(String sentence) {
    
    return Arrays.asList(sentence.split(" "));
  }

  private String reversedWord(String word) {
    StringBuilder reverseWord = new StringBuilder();
    char[] array = word.toCharArray();

    for (int i = word.length()-1; i > 0; i--) {
      reverseWord.append(array[i]);
    }

    return reverseWord.toString();
  }
}