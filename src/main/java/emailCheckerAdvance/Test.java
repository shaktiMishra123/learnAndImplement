package emailCheckerAdvance;

import java.util.function.Function;

public class Test<T,U> {

  U value; // if static then we have to declare type
  Function<U,T> fn;


  public static <T,U> T converToString(U value, Function<U,T> fn){
    return fn.apply(value);
  }

  // U -> Integer
  //T -> String

  public static void main(String[] args) {

 /*   System.out.println(converToString(10));
    System.out.println(Test.<Integer>converToString(10));*/

    System.out.println(Test.<String, Integer>converToString(10,x-> x.toString()));

    Executable exec = () -> System.out.println("test");
    exec.exec();

   /* ExecutableTest executableTest = arg -> arg != "";
    System.out.println(executableTest.emptyCheck("Shakti"));*/

    ExecutableTest.emptyCheck("").check();








  }

}
