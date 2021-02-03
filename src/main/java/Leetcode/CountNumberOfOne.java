package Leetcode;

public class CountNumberOfOne {
  public static void main(String[] args) {
    System.out.println(hammingWeight(15));
  }

  public static int hammingWeight(int n){
    int counter =0;
    while (n != 0){
      int andVar = n & 1;
      if(andVar == 1){
        counter++;
      }
      n = n >> 1;
    }
    return counter;
  }
}
