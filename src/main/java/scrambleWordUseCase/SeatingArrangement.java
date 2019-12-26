package scrambleWordUseCase;

import java.util.Scanner;
import java.util.function.*;

public class SeatingArrangement {
  static UnaryOperator<Integer> seatNumberForBirthType =  (selectedSeat) -> selectedSeat % 12;
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
    System.out.println(seatNumberForBirthType.apply(seatNumber));
    caseWhenSeatSelectedIsZeroConsumer.accept(seatNumber);
    String seatAndBirth;
    switch (seatNumberForBirthType.apply(seatNumber)){
      case 0 :  seatAndBirth = seatNumber - 11 + ": WS";break;
      case 1 :  seatAndBirth = seatNumber + 11 + ": WS";break;
      case 2 :  seatAndBirth = seatNumber + 9 +  ": MS";break;
      case 3 :  seatAndBirth = seatNumber + 7 +  ": AS";break;
      case 4 :  seatAndBirth = seatNumber + 5 +  ": AS";break;
      case 5 :  seatAndBirth = seatNumber + 3 +  ": MS";break;
      case 6 :  seatAndBirth = seatNumber + 1 +  ": WS";break;
      case 7 :  seatAndBirth = seatNumber - 1 +  ": WS";break;
      case 8 :  seatAndBirth = seatNumber - 3 +  ": MS";break;
      case 9 :  seatAndBirth = seatNumber - 5 +  ": AS";break;
      case 10 : seatAndBirth = seatNumber - 7 +  ": AS";break;
      case 11 : seatAndBirth = seatNumber - 9 +  ": MS";break;
      default:
        throw new IllegalStateException("Unexpected value: " + seatNumber);
    }
    System.out.println(seatAndBirth);
  }
}
