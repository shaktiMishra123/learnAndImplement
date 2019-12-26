package lambdas;

import java.util.Comparator;

public class ImplementingComparator {
  public static void main(String[] args) {

    Comparator<Integer> integerComparator = (integer, anotherInteger) -> integer.compareTo(anotherInteger);
    System.out.println(integerComparator.compare(2,4));
  }
}
