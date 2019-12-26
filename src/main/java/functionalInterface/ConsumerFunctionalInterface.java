package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerFunctionalInterface {
  private static Consumer<Student> c1 = student -> System.out.println(student);
  private static Consumer<Student> c2 = student -> System.out.print(student.getName());
  private static Consumer<Student> c3 = student -> System.out.println(student.getActivities());

  public static void printStudent(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c1);
  }

  public static void printStudentNameAndActivity(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(c2.andThen(c3));
  }

  public static void printStudentNameAndActivityWithCondition(){
    System.out.println("printing condition");
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach((student) ->{
      if(student.getGradeLevel() >= 3.9)
        c2.andThen(c3).accept(student);
    } );
  }



  public static void main(String[] args) {
    Consumer<String> stringConsumer = (s -> System.out.println(s.toUpperCase()));
    stringConsumer.accept("Shakti");
    System.out.println(StudentDataBase.getAllStudents());

    printStudent();
    printStudentNameAndActivity();
    printStudentNameAndActivityWithCondition();

  }
}
