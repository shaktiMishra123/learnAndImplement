package streams;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamFlatMap {
  static Predicate<String> stringPredicate = s -> !s.equals("swimming");

  static List<String> stringList = new ArrayList<>();
  public static void main(String[] args) {
    printingAllActivitiesAsList();
    printStudentNameInSortedByName().forEach(System.out::println);
    System.out.println("Reverse order");
    printStudentNameInSortedByNameReversed().forEach(System.out::println);
  }

  private static List<Student> printStudentNameInSortedByName() {
   return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(toList());
  }

  private static List<Student> printStudentNameInSortedByNameReversed() {
    return StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName).reversed()).collect(toList());
  }

  private static void printingAllActivitiesAsList() {
    System.out.println(StudentDataBase.getAllStudents().stream().map(student -> student.getActivities()).flatMap(student -> student.stream()).collect(toList()));
    System.out.println(StudentDataBase.getAllStudents().stream().map(student -> student.getActivities()).flatMap(student -> student.stream()).distinct().count());
   /* System.out.println(StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(toList()));
    stringList.stream().sorted().collect(Collectors.toSet());*/
    System.out.println(StudentDataBase.getAllStudents().stream().map(student -> student.getActivities()).flatMap(student -> student.stream()).
        filter(stringPredicate ).collect(Collectors.toList()));
  }
}
