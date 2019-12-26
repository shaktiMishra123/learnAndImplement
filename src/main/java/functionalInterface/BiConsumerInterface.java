package functionalInterface;

import data.Student;
import data.StudentDataBase;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerInterface {

  public static void printNameAndActivities(){
    List<Student> studentList = StudentDataBase.getAllStudents();
//    BiConsumer<String,List<String>> biConsumer = (name,activity) -> System.out.println(name +":"+ activity);
    StudentDetails studentDetails = new StudentDetails();
    studentList.forEach(student -> studentDetails.accept(student.getName(),student.getActivities()));

    BiConsumer<Integer,Integer> integerIntegerBiConsumer = new BiConsumer<Integer, Integer>() {
      @Override
      public void accept(Integer arg1, Integer arg2) {
        System.out.println(arg1 +":"+arg2);
      }
    };
  }





  public static void printMultyplyAndDivide(){
    BiConsumer<Integer,Integer> multiply = (a,b) -> System.out.println(a * b);
    BiConsumer<Integer,Integer> devide = (a,b) -> System.out.println(a/b);
    multiply.andThen(devide).accept(10,5);
  }

  public static void printUpperCaseTwoString(){
    BiConsumer<String,String> biConsumer = (a,b) -> System.out.println(a.toUpperCase() + ":" + b.toUpperCase());
    biConsumer.accept("shakti","sanjeev");
  }
  public static void main(String[] args) {
    printNameAndActivities();
    printMultyplyAndDivide();
    printUpperCaseTwoString();
    System.out.println();

  }
}
