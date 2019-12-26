package scrambleWordUseCase;

import java.util.Arrays;
import java.util.function.BiPredicate;


public class Scramble2 {
  private static QuadPredicate<String,String,String,String> quadPredicate = (a,b,c,d) -> (a.length() == b.length() ) && (c.equalsIgnoreCase(d));
  private static BiPredicate<String,String> biPredicate = (a,b) -> (a.length() == b.length()) && a.equalsIgnoreCase(b);
  private static String sortedString(char[] str1) {
    Arrays.sort(str1);
    return new String(str1);
  }
  public static void main(String[] args) {
    String scrumbledSExample = "shakti";
    String sruumbledString = "itskha";
    char[] str1 = scrumbledSExample.toCharArray();
    char[] str2 = sruumbledString.toCharArray();
    String originalArrayAfterSort = sortedString(str1);
    String scrambledArrayAfterSort = sortedString(str2);
    boolean returnValue = quadPredicate.Test(scrumbledSExample,sruumbledString,originalArrayAfterSort,scrambledArrayAfterSort);
    boolean returnValue2 = biPredicate.test(originalArrayAfterSort,scrambledArrayAfterSort);
    System.out.println(returnValue);
    System.out.println(returnValue2);
  }
}
