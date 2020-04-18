package validator;


import java.util.function.Function;

public class FunctionTest {
  public static void main(String[] args) {


    Function<Integer,Integer> integerFunction = (arg) -> arg + arg;
    System.out.println(integerFunction.apply(10));

  }
}
