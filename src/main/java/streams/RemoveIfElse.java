package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class RemoveIfElse {

  static Function<String,String> stringFunction = (a) ->
      a.equalsIgnoreCase("Shakti") ? "testShakti" :
          a.equalsIgnoreCase("abhishek") ?"testAbhishek" :
           a.equalsIgnoreCase("sushant") ? "testSushant" : "returnNothing";

  public static void main(String[] args) {
    List<String>  integerList = Arrays.asList("Shakti","sushant","abhishek","default");

    integerList.forEach(name -> {
         System.out.println("value for " +name+ " --> " +stringFunction.apply(name));

});

  }



}
