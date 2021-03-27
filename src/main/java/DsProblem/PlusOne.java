package DsProblem;

public class PlusOne {
  public static void main(String[] args) {
    int[] digits = new int[]{9};
    int[] res = plusOne(digits);
    for (int i : res){
      System.out.println(i);
    }

  }

  public static int[] plusOne(int[] digits) {
   for (int i = digits.length - 1 ; i >= 0 ; i --){
     if(digits[i] < 9 ){
       digits[i] ++;
       return digits;
     }
     digits[i] = 0;
   }

  int[] result = new int[digits.length + 1];
   result[0] = 1;
   return result;
  }
}
