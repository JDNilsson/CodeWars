package katas.kyu6;

/* []                                -->  "no one likes this"
["Peter"]                         -->  "Peter likes this"
["Jacob", "Alex"]                 -->  "Jacob and Alex like this"
["Max", "John", "Mark"]           -->  "Max, John and Mark like this"
["Alex", "Jacob", "Mark", "Max"]  -->  "Alex, Jacob and 2 others like this" */


public class WhoLikesIt {
  
  public static String whoLikesIt(String[] names) {

    StringBuilder sb = new StringBuilder();

    if (names.length == 0) {
      return "no one likes this";
    } else if (names.length == 1) {
      return names[0] + " likes this";
    } else if (names.length < 4) {
      for (int i = 0; i < names.length; i++) {
        sb.append(names[i]);
        if (i == names.length-2) {
          sb.append(" and ");
        } else {
          sb.append(", ");
        }
      }
      sb.append(names[names.length-1]);
      sb.append(" like this");
    } else {
      sb.append(names[0] + ", " + names[1] + " and ");
      sb.append(names.length - 2);
      sb.append(" others like this");
    }

    return sb.toString();
}
}


