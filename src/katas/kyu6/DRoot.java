package katas.kyu6;
import java.util.Arrays;

public class DRoot {
  public static int digital_root(int n) {
    int res = Arrays.asList(Integer.toString(n).split(""))
                                   .stream()
                                   .mapToInt(i -> Integer.parseInt(i))
                                   .sum();

    return res % 10 > 0 ? DRoot.digital_root(res) : res;

  }
}