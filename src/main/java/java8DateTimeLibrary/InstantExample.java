package java8DateTimeLibrary;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class InstantExample {
  public static void main(String[] args) {
    Instant instant = Instant.now();
    System.out.println(instant);

    ZonedDateTime zonedDateTime =ZonedDateTime.now(ZoneId.of("UTC"));
    System.out.println(zonedDateTime);
    System.out.println(zonedDateTime.toInstant().toEpochMilli());

    long ms = 1494226980000L;
    System.out.println(Instant.ofEpochMilli(ms));

    System.out.println(instant);
    System.out.println(Instant.ofEpochSecond(1));

    System.out.println(Duration.between(instant,Instant.now().plus(2, ChronoUnit.HOURS)).toHours());
    System.out.println(Duration.between(instant,Instant.now().plus(2, ChronoUnit.HOURS)).toDays());
  }
}
