package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateCombo {

   static Predicate<Student> studentPredicate = student -> student.getGpa() >= 3.9;
   static Predicate<Student> studentPredicate1 = student -> student.getGradeLevel() >= 3;
   static BiPredicate<Double,Integer> studentBiPredicate = (gpa,gradeLevel) -> gpa >=3.9  && gradeLevel >=3;

  private static BiConsumer<String,List<String>> studentBiConsumer = (name,activity) -> {
    System.out.println(name + "|" + activity);
  };
  public static void consumerAndPredicate(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    Consumer<Student> studentConsumer = (student -> {
      if(studentPredicate.and(studentPredicate1).test(student))
        System.out.println(student);
    });

    studentList.forEach(studentConsumer::accept);
  }

  public static void consumerAndPredicateForPrintingNameAndActivity(){
    List<Student> studentList = StudentDataBase.getAllStudents();
    Consumer<Student> studentConsumer = (student -> {
      if(studentPredicate.and(studentPredicate1).test(student))
        System.out.println(student.getName() + ":" +student.getActivities());
    });

    studentList.forEach(student -> studentConsumer.accept(student));
  }

  public static void biconsumerAndPredicateForPrintingNameAndActivity(){
    System.out.println("biconsumerAndPredicateForPrintingNameAndActivity");
    List<Student> studentList = StudentDataBase.getAllStudents();
    Consumer<Student> studentConsumer = (student -> {
      if(studentPredicate.and(studentPredicate1).test(student))
        studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    studentList.forEach(student -> studentConsumer.accept(student));
  }

  public static void biPredicateBiconsumerAndPredicateForPrintingNameAndActivity(){
    System.out.println("biPredicateBiconsumerAndPredicateForPrintingNameAndActivity");
    List<Student> studentList = StudentDataBase.getAllStudents();
    Consumer<Student> studentConsumer = (student -> {
      if(studentBiPredicate.test(student.getGpa(),student.getGradeLevel()))
        studentBiConsumer.accept(student.getName(),student.getActivities());
    });

    studentList.forEach(student -> studentConsumer.accept(student));
  }

  public static void main(String[] args) {
    consumerAndPredicate();
    consumerAndPredicateForPrintingNameAndActivity();
    biconsumerAndPredicateForPrintingNameAndActivity();
    biPredicateBiconsumerAndPredicateForPrintingNameAndActivity();
  }
}
