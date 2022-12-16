package katas.kyu6;

import java.lang.Math;
import java.util.ArrayList;
import java.util.List;

public class BitCounting {

	public static int countBits(int n){
    return intToBits(n).stream().mapToInt(x -> x).sum();
	}

  public static List<Integer> intToBits(int n) {

    List<Integer> bits = new ArrayList<>();
    int largestPower = 0;
    int inputNumber = n;

    while (inputNumber >= powInt(2, largestPower+1)) {
      largestPower++;
    }

    for (int i = largestPower; i >= 0; i--) {
      if (inputNumber >= powInt(2, i)) {
        bits.add(1);
        inputNumber -= powInt(2, i);
      } else {
        bits.add(0);
      }
    }
    System.out.println(bits.toString().replace(",", "").replace("[", "").replace("]", "").replace(" ", "").trim());
    return bits;
  }

  public static int powInt(int a, int b) {
    return (int) Math.pow((double) a, (double) b);
  }
}