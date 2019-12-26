package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamReduce {

  static Optional<Integer> reduceExample(){
    List<Integer> integerList = Collections.singletonList(1);
    return Optional.ofNullable(integerList.stream().reduce(1, (a, b) -> a * b));
  }

  static Integer reduceExample1(){
    List<Integer> integerList = Collections.emptyList();
    return integerList.stream().reduce(1, (a, b) -> a * b);
  }

  static Optional<Student> getMaximumGpaOfStudent(){
    return StudentDataBase.getAllStudents().stream().reduce((a,b)-> (a.getGpa() > b.getGpa()) ? a : b);
  }



  public static void main(String[] args) {
    Optional<Integer> optionalInteger = reduceExample();
    System.out.println(optionalInteger.get());
    System.out.println(reduceExample1());
    System.out.println(getMaximumGpaOfStudent().get());


  }
}
