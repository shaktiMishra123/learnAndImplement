package java8DateTimeLibrary;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DateToLocalDateExample {
  public static void main(String[] args) {
    /**
     * Java.Util.Date to LocalDateTIme
     */
    Date date = new Date();
    System.out.println(date);

    System.out.println(date.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());

    /**
     * java.sql.date to LocalDateTIme
     */

    java.sql.Date  date1 = java.sql.Date.valueOf(LocalDate.now());
    System.out.println(date1);

  }
}
