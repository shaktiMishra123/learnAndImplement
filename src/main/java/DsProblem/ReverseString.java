package DsProblem;


import java.util.Stack;

public class ReverseString {
  public static void main(String[] args) {

   char[] charArray = {'h','e','l','l','o'};
   reverseString(charArray);
  }

  public static void reverseString(char[] s) {
    Stack<Character> characterStack = new Stack<>();
    for (char c : s){
      characterStack.push(c);
    }

    for (int i = 0;i < s.length;i++){
      s[i] = characterStack.pop();
    }
  }
}
