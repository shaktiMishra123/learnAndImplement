package java8DateTimeLibrary;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

  public static void parseLocalDate(String string){
    /**
     * Convert string to localDate (Parse)
      */
    LocalDate localDate = LocalDate.parse(string);
    System.out.println(localDate);
    System.out.println(LocalDate.parse(string, java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd")));
    System.out.println(LocalDate.parse(string, java.time.format.DateTimeFormatter.ISO_LOCAL_DATE));

    String date = "20180402";
    System.out.println(LocalDate.parse(date, java.time.format.DateTimeFormatter.BASIC_ISO_DATE));
    System.out.println(LocalDate.parse(date, java.time.format.DateTimeFormatter.ofPattern("yyyyMMdd")));
    String date1 = "2018|02|05";
    System.out.println(LocalDate.parse(date1, java.time.format.DateTimeFormatter.ofPattern("yyyy|MM|dd")));
  }

  public static void formatLocalDate( ){
    /**
     * Convert localDate to String (Format)
     */

    LocalDate date = LocalDate.of(2019,10,10);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy|MM|dd");
    String formattedDate = date.format(formatter);
    System.out.println(formattedDate);



  }

  public static void main(String[] args) {
   parseLocalDate("2017-02-05");
   formatLocalDate();


  }
}
