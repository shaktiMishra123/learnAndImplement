package useCasesUsingFunctionalPrograming;

import data.Student;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
  public static void main(String[] args) {

//    TestPredicate food1 = TestPredicate.withColor("blue");
//    TestPredicate food2 = TestPredicate.withTaste("Sour");
//    TestPredicate food3 = TestPredicate.withColorAndTaste("blue","Bitter");
//
//    System.out.println(food1);
//    System.out.println(food2);
//    System.out.println(food3);

//    TestPredicate tp =
//        Integer result =
            TestPredicate
                .withPredicate((str1,str2) -> str1.length() == str2.length())
                .doOperations((a,b) -> a+b)
                .compareTo(30);

    System.out.println(TestPredicate.withPredicate1((a,b) -> a.equalsIgnoreCase(b)));
//    System.out.println(result);

    Map<String,Student> stringStudentMap = new HashMap<>();
    List<Student> studentList = new ArrayList<>();
    System.out.println(studentList.stream().map(x -> x.getGpa()).collect(Collectors.toList()));

    //stringStudentMap.get()
  }
}
