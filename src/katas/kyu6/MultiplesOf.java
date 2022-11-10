package katas.kyu6;

import java.util.stream.IntStream;

public class MultiplesOf {

  public int solution(int number) {

    return IntStream.range(0, number)
                    .filter(i -> i%3==0 || i%5==0)
                    .sum();
                    
  }
}