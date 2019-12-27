package scrambleWordUseCase;

import java.util.Scanner;
import java.util.function.*;

public class SeatingArrangement {
  static UnaryOperator<Integer> seatNumberForBerthType =  (selectedSeat) -> selectedSeat % 12;
  static Predicate<Integer> caseWhenSeatSelectedIsZeroPredicate = (seatNo)  -> seatNo == 0;
  static Consumer<Integer> caseWhenSeatSelectedIsZeroConsumer = (seatNo) -> {
    if(caseWhenSeatSelectedIsZeroPredicate.test(seatNo)){
      System.out.println("Zero is not a valid seat number");
      System.exit(0);}
  };

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Seat Number :");
    int seatNumber = sc.nextInt();
    System.out.println(seatNumberForBerthType.apply(seatNumber));
    caseWhenSeatSelectedIsZeroConsumer.accept(seatNumber);
    String seatAndBerth;
    switch (seatNumberForBerthType.apply(seatNumber)){
      case 0 :  seatAndBerth = seatNumber - 11 + ": WS";break;
      case 1 :  seatAndBerth = seatNumber + 11 + ": WS";break;
      case 2 :  seatAndBerth = seatNumber + 9 +  ": MS";break;
      case 3 :  seatAndBerth = seatNumber + 7 +  ": AS";break;
      case 4 :  seatAndBerth = seatNumber + 5 +  ": AS";break;
      case 5 :  seatAndBerth = seatNumber + 3 +  ": MS";break;
      case 6 :  seatAndBerth = seatNumber + 1 +  ": WS";break;
      case 7 :  seatAndBerth = seatNumber - 1 +  ": WS";break;
      case 8 :  seatAndBerth = seatNumber - 3 +  ": MS";break;
      case 9 :  seatAndBerth = seatNumber - 5 +  ": AS";break;
      case 10 : seatAndBerth = seatNumber - 7 +  ": AS";break;
      case 11 : seatAndBerth = seatNumber - 9 +  ": MS";break;
      default:
        throw new IllegalStateException("Unexpected value: " + seatNumber);
    }
    System.out.println(seatAndBerth);
  }
}
