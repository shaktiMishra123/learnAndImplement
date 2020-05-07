package java8DateTimeLibrary;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class InstantExample {
  public static void main(String[] args) {
    Instant instant = Instant.now();
    System.out.println(instant);

    System.out.println(instant.getEpochSecond());
    System.out.println(Instant.ofEpochSecond(1));

    System.out.println(Duration.between(instant,Instant.now().plus(2, ChronoUnit.HOURS)).toHours());
    System.out.println(Duration.between(instant,Instant.now().plus(2, ChronoUnit.HOURS)).toDays());
  }
}
