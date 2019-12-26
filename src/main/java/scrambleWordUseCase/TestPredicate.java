package scrambleWordUseCase;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class TestPredicate {
  private final BiPredicate<String,String> predicateFn;
  private int a = 10;
  private int b =20;
  private static String c = "ab";
  private static String d = "cd";

  private TestPredicate(BiPredicate<String, String> predicateFn) {
    this.predicateFn = predicateFn;
  }

  public static TestPredicate withPredicate(BiPredicate<String,String> preFn) {
    return new TestPredicate(preFn);
  }

  public static boolean withPredicate1(BiPredicate<String,String> preFn) {
    return preFn.test(c,d);
  }

  public Integer doOperations(BiFunction<Integer,Integer,Integer> fn){
    return  fn.apply(a,b);
  }

 /* private final String color;
  private final String taste;


  private TestPredicate(String color, String taste) {
    this.color = color;
    this.taste = taste;
  }

  public static TestPredicate withColor(String color){
    return new TestPredicate(color,"Sweet");
  }

  public static TestPredicate withTaste(String taste){
    return new TestPredicate("Red",taste);
  }

  public static TestPredicate withColorAndTaste(String color,String taste){
    return new TestPredicate(color,taste);
  }

  @Override
  public String toString() {
    return "TestPredicate{" +
        "color='" + color + '\'' +
        ", taste='" + taste + '\'' +
        '}';
  }*/
}
