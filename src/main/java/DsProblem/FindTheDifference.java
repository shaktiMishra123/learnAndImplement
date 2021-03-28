package DsProblem;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {
  public static void main(String[] args) {
    String firstString = "abcd";
    String secondString = "abcda";
    char res = findTheDifference(firstString,secondString);
    System.out.println(res);

  }

  public static char findTheDifference(String s, String t) {
    Map<Character,Integer> characterMap = new HashMap<>();

    for (char i : s.toCharArray()){
      characterMap.put(i, characterMap.getOrDefault(i,0) + 1);
    }

    for (char j : t.toCharArray()){
      if(!characterMap.containsKey(j) || characterMap.get(j) == 0){
        return j;
      }
      else {
        characterMap.put(j,characterMap.get(j) - 1);
      }
    }

return '!';

  }
}
