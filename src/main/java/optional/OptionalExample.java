package optional;

import data.Student;
import data.StudentDataBase;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
  public static Optional<String> getStudentName(){
    Student student = null;
    return Optional.ofNullable(student.getName());
  }


  public static void main(String[] args) {
    System.out.println(getStudentName().get());

  }
}
