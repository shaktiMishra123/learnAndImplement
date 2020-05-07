package java8DateTimeLibrary;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDates {
  public static void main(String[] args) {
    LocalDate localDate = LocalDate.now();
    LocalDate localDate1 = localDate.plusDays(10);


    System.out.println(Period.between(localDate,localDate1).getDays());
    System.out.println(Period.between(localDate,localDate1).getMonths());
    System.out.println(Period.between(localDate,localDate1).getYears());

    System.out.println(Period.of(0,0,10).getDays());
    System.out.println(Period.of(0,0,10).getYears());
    System.out.println(Period.of(2,0,10).toTotalMonths());
  }
}
