package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionInterface {

  static Predicate<Student> p1 = (student -> student.getGpa()>=3.9);
  static BiFunction<List<Student>,Predicate<Student>,Map<String,Double>> biFunction = ((students, stringPredicate) ->
  {
    Map<String,Double> mapStudent = new HashMap<>();
    students.forEach(student -> {
      if(stringPredicate.test(student))
      {
      mapStudent.put(student.getName(),student.getGpa());
      }
    });
    return mapStudent;
  });
  public static void main(String[] args) {

    System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),p1));
    
  }
}
