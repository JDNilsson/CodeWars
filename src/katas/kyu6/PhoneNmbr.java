package katas.kyu6;

public class PhoneNmbr {
  
  public static String createPhoneNumber(int[] numbers) {
    
    String numStr = intArrayToString(numbers);

    return "(" + numStr.substring(0, 2) + ") "
              + numStr.substring(3, 5) + "-"
              +numStr.substring(6);
  }

  private static String intArrayToString(int[] numbers) {
    StringBuilder tempBuilder = new StringBuilder();

    for (int i = 0; i < numbers.length-1; i++) {
      tempBuilder.append(numbers[i]);
    }

    return tempBuilder.toString();
    
  }

}