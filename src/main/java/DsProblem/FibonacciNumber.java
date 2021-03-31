package DsProblem;

public class FibonacciNumber {
  public static void main(String[] args) {
      int number = 6;
      int res = fib(number);
      System.out.println(res);
  }

  public static int fib(int n) {
    if(n == 0)
      return 0;
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    for (int i = 2 ; i <= n ; i ++){
      dp[i] = dp[i - 1] + dp[i - 2]; //
      // System.out.println(dp[i]); // for generating fib sequence
    }
    return dp[n];

  }

/*  public static void fib1(int n ){
    int[] dp = new int[n + 1];
    dp[0] = 0;
    dp[1] = 1;
    int prev = 0;
    for (int i = 2 ; i <= n ; i ++){
      dp[i] =
    }
  }*/
}
