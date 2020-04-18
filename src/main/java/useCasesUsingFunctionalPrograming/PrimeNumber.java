package useCasesUsingFunctionalPrograming;

import java.util.Scanner;

import java.util.stream.IntStream;

public class PrimeNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int primeNumberRange = sc.nextInt();
   IntStream.rangeClosed(2,primeNumberRange).forEach( number -> {
     if(number % 2 == 1)
       System.out.println(number);
   });
  }

}
