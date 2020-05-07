package classMapper;

import java.util.function.Predicate;

public class predicateTest {
  public static Mapper<Integer>  udf;
  private final Predicate<Integer> pfn;

  public predicateTest(Predicate<Integer> pfn) {
    this.pfn = pfn;
  }

  static predicateTest check( Predicate<Integer> fn){
    return new predicateTest(fn);
  }

  public boolean getResult(Integer a){
    return pfn.test(a);
  }

}
