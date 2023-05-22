package liteSkoj;

import java.util.Arrays;


public class ValidatePersNr {


  static boolean validate_pnr(String nr_string) {
    
    int[] nrAsList = Arrays.asList(nr_string.split(""))
                                  .stream()
                                  .mapToInt(s -> Integer.parseInt(s))
                                  .toArray();


    int sum = 0;

    for (int i = 0; i < nrAsList.length-1; i++) {
      
      if (i % 2 != 0) {
        sum += nrAsList[i];
      } else if (nrAsList[i] > 4) {
        sum += ((nrAsList[i]*2)%10 + (nrAsList[i]*2)/10);
      } else {
        sum += nrAsList[i]*2;
      }
    }
    
    return nrAsList[9] == Math.round(((float) sum+5)/10)*10-sum;

  }

  public static void main(String[] args) {
    
    System.out.println(ValidatePersNr.validate_pnr("8112189876"));
    System.out.println(ValidatePersNr.validate_pnr("8902013289"));

  }
  
}