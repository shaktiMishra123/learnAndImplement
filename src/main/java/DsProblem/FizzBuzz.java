package DsProblem;

import java.util.LinkedList;
import java.util.List;

public class FizzBuzz {
  public static void main(String[] args) {
      int target = 15;
      List<String> result = new LinkedList<>();
      result = fizzBuzz(target);
      for (String i : result){
        System.out.println(i);
      }
  }

  public static List<String> fizzBuzz(int n) {
      List<String> stringList = new LinkedList<>();
      for (int i = 1 ; i <= n ; i ++){
        if(i % 3 == 0 && i % 5 == 0){
          stringList.add("FizzBuzz");
        }
        else if(i % 3 == 0){
          stringList.add("Fizz");
        }
        else if(i % 5 == 0){
          stringList.add("Buzz");
        }
        else
          stringList.add(Integer.toString(i));
      }
      return stringList;
  }
}
