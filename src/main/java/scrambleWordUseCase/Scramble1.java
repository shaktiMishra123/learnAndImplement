package scrambleWordUseCase;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Scramble1 {
  private static BiPredicate<String,String> stringPredicate = (s1, s2) -> s1.length() == s2.length();
  private static BiPredicate<String,String> stringBiPredicate = (s1,s2) -> s1.equalsIgnoreCase(s2);

  private static boolean returnScrambledString(String string1, String string2){
    if(stringPredicate.test(string1,string2)){
      char[] str1 = string1.toCharArray();
      char[] str2 = string2.toCharArray();
      String originalArrayAfterSort = sortedString(str1);
      String scrambledArrayAfterSort = sortedString(str2);
      if(stringBiPredicate.test(originalArrayAfterSort,scrambledArrayAfterSort))
        return true;
      else
        return false;
    }
    else {
      return false;
    }
  }

  private static String sortedString(char[] str1) {
    Arrays.sort(str1);
    return new String(str1);
  }

  public static void main(String[] args) {
    String scrumbledSExample = "shakti";
    String sruumbledString = "itskha";

    boolean returnValue = returnScrambledString(scrumbledSExample,sruumbledString);
    System.out.println(returnValue);
  }
}
