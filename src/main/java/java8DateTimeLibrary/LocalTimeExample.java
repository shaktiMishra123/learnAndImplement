package java8DateTimeLibrary;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalTimeExample {
  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);
    System.out.println(LocalTime.of(10,12,55));
    System.out.println(LocalTime.of(12,12));
    System.out.println(LocalTime.of(10,12,55,2222));

    /**
     * Getting value from time instance
     */
    System.out.println(localTime.getHour());
    System.out.println(localTime.getMinute());
    System.out.println(localTime.getSecond());
    System.out.println(localTime.getNano());
    System.out.println(localTime.get(ChronoField.MINUTE_OF_HOUR));
    System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_AMPM));
    System.out.println(localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));

    /**
     * Modify the value of local time
     */

    System.out.println(localTime.plusHours(10));
    System.out.println(localTime.plus(2,ChronoUnit.HOURS));
    System.out.println(localTime.minus(2,ChronoUnit.MINUTES));
    System.out.println(localTime.withHour(10));
    System.out.println(localTime.with(LocalTime.MIDNIGHT));

  }
}
