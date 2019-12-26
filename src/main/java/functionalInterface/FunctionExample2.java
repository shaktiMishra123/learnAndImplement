package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionExample2 {
//Student greater than grade 3
  static Function<List<Student>, Map<String,Double>> studentMapFunction = (student -> {
    Map<String,Double> studentMap = new HashMap<>();
    student.forEach(student1 -> {
      if (ConsumerAndPredicateCombo.studentPredicate1.test(student1)) // using predicates from some other class
      studentMap.put(student1.getName(), student1.getGpa());
    });
    return studentMap;
  });
  public static void main(String[] args) {
    List<Student> studentList =StudentDataBase.getAllStudents();
    Map<String,Double> studentMap = studentMapFunction.apply(studentList);
    System.out.println(studentMap);
  }
}
