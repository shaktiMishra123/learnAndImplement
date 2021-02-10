package DsProblem;


import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class ReverseArray {
  public static void main(String[] args) {
    String[] nameArray = {"Shakti","Biman","Nitesh","Deepak"};
    System.out.println(reverseArray(nameArray));

  }
  //Time Complexity : O(2n) = O(n)
  //space Complexity : O(n)
  public static List<String> reverseArray(String[] nameArray){
    List<String> list = new LinkedList<>();
    Stack<String> nameStack = new Stack<>();
    for (String name : nameArray){
      nameStack.push(name);
    }

    while (!nameStack.isEmpty()){
      list.add(nameStack.pop());
    }
    return list;
  }
}
