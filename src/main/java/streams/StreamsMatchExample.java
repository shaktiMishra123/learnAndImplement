package streams;

import data.Student;
import data.StudentDataBase;

import java.util.function.Predicate;

public class StreamsMatchExample {
  private static Predicate<Student> integerPredicate = s -> s.getGpa() >= 3.9;
  private static boolean allMatch(){
   return StudentDataBase.getAllStudents().stream().allMatch(integerPredicate);
  }

  private static boolean anyMatch(){
    return StudentDataBase.getAllStudents().stream().anyMatch(integerPredicate);
  }

  private static boolean noneMatch(){
    return StudentDataBase.getAllStudents().stream().noneMatch(integerPredicate);
  }

  public static void main(String[] args) {
    System.out.println(allMatch());
    System.out.println(anyMatch());
    System.out.println(noneMatch());


  }
}
