package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateInterface {
  private static Predicate<Student> predicate = (student -> student.getGradeLevel() >= 3);
  private static Predicate<Student> predicate1 = (student -> student.getGpa() >= 3.9);

  public static void printStudentsWithCondition(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      if(predicate.test(student))
        System.out.println(student);
    });
  }

  public static void printStudentsWithConditionGPA(){
    System.out.println("printStudentsWithConditionGPA");
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      if(predicate1.test(student))
        System.out.println(student);
    });
  }

  public static void printStudentsWithConditionGPAAndGradeLevel(){
    System.out.println("printStudentsWithConditionGPAAndGradeLevel");
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      if(predicate1.and(predicate).test(student))
        System.out.println(student);
    });
  }

  public static void printStudentsWithConditionGPAOrGradeLevel(){
    System.out.println("printStudentsWithConditionGPAOrGradeLevel");
    List<Student> studentList = StudentDataBase.getAllStudents();
    studentList.forEach(student -> {
      if(predicate1.or(predicate).test(student))
        System.out.println(student);
    });
  }


  public static void main(String[] args) {
    printStudentsWithCondition();
    printStudentsWithConditionGPA();
    printStudentsWithConditionGPAAndGradeLevel();
    printStudentsWithConditionGPAOrGradeLevel();
  }
}
