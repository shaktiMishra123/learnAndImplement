package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.stream.Collectors;

public class MapReduceExample {
  public static void main(String[] args) {

    System.out.println(StudentDataBase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList()));

  }
}
