package FunctionImplementation;

import java.util.function.Function;

public class FunctionMain {
  public static void main(String[] args) {
  /*  FunctionTest.withFUnction((a) -> a*3).getResult(10);
    System.out.println(FunctionTest.withFUnction((a) -> a*3).getResult(10));*/

//    FunctionTest.withBiFunction((a, b) -> a * b).withFUnction(a -> a * 3).getResult(10);
//    System.out.println(FunctionTest.withBiFunction((a, b) -> a * b).withFUnction(a -> a * a).getAll());

    System.out.println(FunctionTest.withBiFunction((a, b) -> a + b).withFUnction(a -> a * 2).getExceptionalResult(10, 20));

    //System.out.println(FunctionTest.get().withBiFunction((a,b) -> a+b).withFUnction(a -> a*2).getResult(10));


    //.withFUnction(a-> a* 3).getResult(10));

    // FunctionTest.withBiFunction((a,b) -> a * b).withFUnction()
  }
}
