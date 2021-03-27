package DsProblem;


import java.util.Arrays;

public class ValidAnagram {
  public static void main(String[] args) {
    String s = "shakti";
    String t = "ishaktp";
    boolean res = isAnagram(s,t);
    System.out.println(res);
  }

  public static boolean isAnagram(String s, String t) {
    char[] sArr = s.toCharArray();
    char[] tArr = t.toCharArray();
    return sortedArr(sArr).equalsIgnoreCase(sortedArr(tArr));
  }

  public static String sortedArr(char[] str){
    Arrays.sort(str);
    return new String(str);
  }
}
