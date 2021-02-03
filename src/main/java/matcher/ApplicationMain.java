package matcher;

import java.util.Arrays;

import static matcher.Matchers.*;
import static java.util.Collections.*;

public class ApplicationMain {
  public static void main(String[] args) {
    Matcher<String> notempty = (str) -> ! str.isEmpty();
    System.out.println(notempty.test(""));

    //System.out.println( Matchers.just(notempty.test("")));

    Matcher<String> startsWith = (str) -> str.startsWith("A");
    System.out.println(startsWith.test("shakti"));
    Matcher<String> validString = and(notempty,startsWith);
    System.out.println(validString.test("Ayushi"));

    Matcher<String> validStringStartsWithA = and(Arrays.asList(notempty, startsWith));
    System.out.println(validStringStartsWithA.test("SHakti"));

    Matcher<String> validString1 = and(isString(),notempty);
    System.out.println(validString1.test(null));

    System.out.println(isString().test(1));

    String validValue = "abc.toDate";



  }
}
