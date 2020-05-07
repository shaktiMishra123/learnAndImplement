package java8DateTimeLibrary;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalDateTimeExample {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    System.out.println(LocalDateTime.of(2018,12,02,10,10,10));
    System.out.println(LocalDateTime.of(LocalDate.now().getYear(),LocalDate.now().getMonth(),
        12,10,10,10, LocalTime.now().getNano()));


    /**
     * get localDateTime
     */

    System.out.println(localDateTime.getHour());
    System.out.println(localDateTime.getYear());
    System.out.println(localDateTime.get(ChronoField.HOUR_OF_DAY));
    System.out.println(localDateTime.get(ChronoField.MINUTE_OF_HOUR));

    /**
     * Modify localDateTime
     */

    System.out.println(localDateTime.plusYears(02));
    System.out.println(localDateTime.plus(2,ChronoUnit.HOURS));
    System.out.println(localDateTime.minus(2,ChronoUnit.MINUTES));

    /**
     * Converting LocalDate,LocalTime to localDateTime and vice versa
     */

    LocalDate localDate = LocalDate.now();
    System.out.println(localDate.atTime(12,33));

    LocalTime localTime = LocalTime.now();
    System.out.println(localTime.atDate(LocalDate.of(2019,10,10)));

    System.out.println(localDateTime);
    System.out.println(localDateTime.toLocalDate());
    System.out.println(localDateTime.toLocalTime());


  }

}
