package DsProblem;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseArray {
  public static void main(String[] args) {
    String[] nameArray = {"Shakti","Biman","Nitesh","Deepak"};
    //System.out.println(reverseArray(nameArray));
    Arrays.stream(reverseArray(nameArray)).forEach(s -> System.out.print(s + " "));

  }
  //Time Complexity : O(2n) = O(n)
  //space Complexity : O(n)
  public static String[] reverseArray(String[] nameArray){
   // List<String> list = new LinkedList<>();
    String[] reverseArr = new String[nameArray.length];
    Stack<String> nameStack = new Stack<>();
    for (String name : nameArray){
      nameStack.push(name);
    }

    for (int i = 0;i < nameArray.length;i++){
      reverseArr[i] = nameStack.pop();
    }
    return reverseArr;

/*    while (!nameStack.isEmpty()){
      list.add(nameStack.pop());
    }
    return list;*/
  }
}
