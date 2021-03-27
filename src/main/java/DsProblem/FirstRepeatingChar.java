package DsProblem;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {
  public static void main(String[] args) {
    String inputString = "dabbad";
    String out = firstRepeating(inputString);
    System.out.println(out);
  }

  public static String firstRepeating(String inputString){
    Map<Character, Integer> stringIntegerMap = new HashMap<>();
    char[] inputArr = inputString.toCharArray();
    for (char i : inputArr){
      stringIntegerMap.put(i,stringIntegerMap.getOrDefault(i,0) + 1);
    }
    for (char i : inputArr){
      if(stringIntegerMap.get(i) > 1){
        return "first repeating string is : "+i;
      }
    }
    return "no repeating string found";
  }
}
