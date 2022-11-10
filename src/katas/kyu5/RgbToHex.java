package katas.kyu5;

public class RgbToHex {

  public static String rgbToHex(int r, int g, int b) {
      
    
    
    return decToHex(r) + decToHex(g) + decToHex(b);
  }

  public static String decToHex(int dec) {

    int tempDec;
    if (dec<0) {
      tempDec = 0;
    }else if (dec>255) {
      tempDec = 255;
    } else {
      tempDec = dec;
    }
    
    String[] hexReps = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"}; 

    return hexReps[tempDec/16] + hexReps[tempDec%16];

  }


}