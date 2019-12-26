package methodReference;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class methodReference {
  static Consumer<String> stringConsumer = (s -> System.out.println(s.toUpperCase()));
  static Consumer<String> stringConsumer1 = (s -> System.out.println(s.toUpperCase()));
  static Consumer<Student> studentConsumer = (student -> System.out.println(student)) ;

  public static void printResult(){
    //List<Student> studentList = new ArrayList<>();
    List<String> stringList = Arrays.asList("a","b","c","d");
    stringList.forEach(stringConsumer1);
  }
  public static void main(String[] args) {
stringConsumer.accept("shakti");
printResult();
  }
}
