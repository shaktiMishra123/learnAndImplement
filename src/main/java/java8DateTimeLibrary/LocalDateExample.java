package java8DateTimeLibrary;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {
  public static void main(String[] args) {
    LocalDate localDate =  LocalDate.now();
    System.out.println(localDate);

    /**
     * get localDate Value
     */

    System.out.println(LocalDate.of(2017,10,02));
    System.out.println(LocalDate.ofYearDay(2018,10));
    System.out.println(LocalDate.now().getMonth().getValue());
    System.out.println(localDate.getYear());
    System.out.println(localDate.getDayOfYear());
    System.out.println(localDate.getDayOfWeek().getValue());
    System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));

    /**
     * Modifying localDate
     */

    System.out.println(localDate.plusDays(2));
    System.out.println(localDate.plusMonths(2));
    System.out.println(localDate.minusDays(2));
    System.out.println(localDate.withYear(2019));
    System.out.println(localDate.with(ChronoField.YEAR,2020));
    System.out.println(localDate.with(TemporalAdjusters.lastDayOfYear()));
    System.out.println(localDate.with(TemporalAdjusters.firstDayOfMonth()));
    System.out.println(localDate.minusYears(10));
    System.out.println(localDate.minus(9, ChronoUnit.YEARS));
    System.out.println(localDate.minus(9, ChronoUnit.MONTHS));


    /**
     * Addition Support method
     */

    System.out.println(localDate.isLeapYear());
    System.out.println(LocalDate.of(2022,05,12).isLeapYear());
    System.out.println(localDate.isEqual(LocalDate.now().minus(0,ChronoUnit.DAYS)));
    System.out.println(localDate.isBefore(LocalDate.now().minus(1,ChronoUnit.DAYS)));
    System.out.println(localDate.isAfter(LocalDate.now().minus(1,ChronoUnit.DAYS)));


    /**
     * Unsupported
     */

    //System.out.println(localDate.get(ChronoField.HOUR_OF_DAY));

    System.out.println(LocalDate.now().isSupported(ChronoField.HOUR_OF_DAY));
    System.out.println(LocalDate.now().isSupported(ChronoField.YEAR));

  }
}
