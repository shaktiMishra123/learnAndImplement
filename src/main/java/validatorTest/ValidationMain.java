package validatorTest;

import java.util.HashSet;
import java.util.Set;

public class ValidationMain {


  public static void main(String[] args) {
    Set<String> defaultRegions = new HashSet<String>();
    defaultRegions.add("test");

   Validators.notEmpty(defaultRegions,"message Type").check();
    System.out.println();
  }
}
