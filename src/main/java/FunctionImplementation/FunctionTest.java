package FunctionImplementation;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionTest {

  public final Function<Integer, Integer> integerFn;
  public final BiFunction<Integer, Integer, Integer> Bifunction;

  public FunctionTest(Function<Integer, Integer> integerFn, BiFunction<Integer, Integer, Integer> bifunction) {
    this.integerFn = integerFn;
    this.Bifunction = bifunction;
  }

/*  public static FunctionTest get() {
    return new FunctionTest(null, null);
  }*/

  public FunctionTest withFUnction(Function<Integer, Integer> integerFn) {
    return new FunctionTest(integerFn, Bifunction);
  }
// if in place of Bifunction we put null our main function will through null pointer exception as we are not passing object Bifunction here

/*  public FunctionTest withFUnction(Function<Integer, Integer> integerFn) {
    return new FunctionTest(integerFn, Bifunction);
  }*/

/*  public FunctionTest withBiFunction(BiFunction<Integer, Integer, Integer> BiFn) {
    return new FunctionTest(integerFn, BiFn);
  }*/

  public static FunctionTest withBiFunction(BiFunction<Integer, Integer, Integer> BiFn) {
    return new FunctionTest(null, BiFn);
  }

  public Integer getResult(int a) {
    return integerFn.apply(a);
  }

  public Integer getResultBifn(int a, int b) {
    return Bifunction.apply(a, b);
  }

  public Integer getExceptionalResult(int a , int b){
    return Bifunction.apply(a,integerFn.apply(b));
  }

  int a = 30;
  int b = 40;

  public Integer getAll() {
    int first = this.a;
    int second = this.b;
    return integerFn.apply(a) + Bifunction.apply(a, b);

  }


}
