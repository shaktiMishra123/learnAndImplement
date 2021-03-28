package DsProblem;


import java.util.Stack;

public class BackSpaceStringCompare {
  public static void main(String[] args) {
    String firstinput = "a#c";
    String secondString = "b";
    boolean result = backspaceCompare(firstinput,secondString);
    System.out.println(result);

  }

  public static boolean backspaceCompare(String S, String T) {
   Stack<Character> characterStack = new Stack<>();
   Stack<Character> characterStack2 = new Stack<>();
   for (char c : S.toCharArray()){
     if(c != '#'){
       characterStack.push(c);
     }
     else if(!characterStack.isEmpty()){
       characterStack.pop();
     }
   }

    for (char c : T.toCharArray()){
      if(c != '#'){
        characterStack2.push(c);
      }
      else if(!characterStack2.isEmpty()){
        characterStack2.pop();
      }
    }

    String out1 = "";
    String out2 = "";
    while (!characterStack.isEmpty()){
      out1 = characterStack.pop() + out1;
    }

    while (!characterStack2.isEmpty()){
      out2 = characterStack2.pop() + out2;
    }

    return out1.equals(out2);

  }
}
