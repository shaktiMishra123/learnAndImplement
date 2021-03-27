package DsProblem;

public class Palindrome {
  public static void main(String[] args) {
    String palindromeString = "MALAYALAM";
    boolean result = isPalindrome(palindromeString);
    System.out.println(result);
    System.out.println(isPalindromeAnother(palindromeString));

  }

  public static boolean isPalindrome(String s) {
    String stringAfterRemovingAlphaNumeric = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    String[] charArr = stringAfterRemovingAlphaNumeric.split("");
    String reverseString = "";
    for (int i = charArr.length - 1 ;  i >=  0; i--){
      reverseString = reverseString + charArr[i];
    }
    return reverseString.equalsIgnoreCase(stringAfterRemovingAlphaNumeric);
  }

  public static boolean isPalindromeAnother(String s) {
    String stringAfterRemovingAlphaNumeric = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    StringBuilder builder = new StringBuilder();
    String reverse = builder.append(stringAfterRemovingAlphaNumeric).reverse().toString();
    return reverse.equalsIgnoreCase(stringAfterRemovingAlphaNumeric);
  }
}
