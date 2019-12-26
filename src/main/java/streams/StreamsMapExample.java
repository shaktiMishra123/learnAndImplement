package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamsMapExample {

  public static void main(String[] args) {
    printNameInList();
  }

  private static void printNameInList() {
    System.out.println(StudentDataBase.getAllStudents().stream().map(s -> s.getName().toUpperCase()).sorted().collect(Collectors.toList()));
    System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName).collect(toList())); // without Collectors keyword
    System.out.println(StudentDataBase.getAllStudents().stream().map(Student::getName).collect(toSet())); // Collecting output asSet
  }
}
