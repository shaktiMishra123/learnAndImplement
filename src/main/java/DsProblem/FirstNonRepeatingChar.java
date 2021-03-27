package DsProblem;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
  public static void main(String[] args) {
    String str = "cc";
     int index = firstUniqChar(str);
    System.out.println(index);
  }

  public static int firstUniqChar(String s) {
    if(s.equals("")) return -1;
    Map<Character,Integer> characterIntegerMap = new HashMap<>();
    char[] chars = s.toCharArray();
    for (char i : chars){
      System.out.println(i);
         characterIntegerMap.put(i,characterIntegerMap.getOrDefault(i,0) + 1);
    }
    System.out.println(characterIntegerMap);
    int j = 0;
    for (char i : chars){
      if(characterIntegerMap.get(i) == 1){
        return j;
      }
      j++;
  }
    return -1;
  }
}
