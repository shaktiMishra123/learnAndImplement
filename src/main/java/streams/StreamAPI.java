package streams;

import data.Student;
import data.StudentDataBase;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPI {


  //Student name and their activities in map
  private static Predicate<Student> studentPredicate = (student -> student.getGpa() >= 3.9);
  private static Predicate<Student> studentPredicateGradeLevel = (student -> student.getGradeLevel() >= 3);

  private static Map<String,List<String>> stringListMap = new HashMap<>();
  private static void printStudentNameAndActivities(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      stringListMap.put(student.getName(),student.getActivities());
    });
    System.out.println(stringListMap);
  }

  private static List<String> stringList1 = new ArrayList<>();
  public static void main(String[] args) {
    List<String> streamList = Arrays.asList("Shakti","Sanjeev","Anand");

    streamList.stream().sorted().collect(Collectors.toList()).forEach( x -> {
      stringList1.add(x.toUpperCase());
        }
        );
    System.out.println("printing upppercase using map "+streamList.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList()));
    System.out.println("printing upppercase using map with concat "+streamList.stream().sorted().map(s -> s.concat("|")).collect(Collectors.toList()));
    //streamList.stream().sorted().map(s -> s.toUpperCase()).collect(Collectors.toList());

    System.out.println(stringList1);
    printStudentNameAndActivities();
    printStudentNameAndActivitiesUsingStreams();
    printStudentNameAndActivitiesUsingStreamsApplyingFilter();
  }

  private static void printStudentNameAndActivitiesUsingStreamsApplyingFilter() {
    Map<String,List<String>> stringListMap = StudentDataBase.getAllStudents().stream()
        .peek(System.out::println)
        .filter(studentPredicate.and(studentPredicateGradeLevel))
        .peek(student -> System.out.println("After Filter" + student))
        .collect(Collectors.toMap(Student::getName,Student::getActivities));
    System.out.println(stringListMap);
  }

  private static void printStudentNameAndActivitiesUsingStreams() {
    Map<String,List<String>> stringListMap = StudentDataBase.getAllStudents().stream().collect(Collectors.toMap(Student::getName,Student::getActivities));
    System.out.println(stringListMap);
  }
}
