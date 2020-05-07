package java8DateTimeLibrary;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParsingUsingLocalDateTimeFormatter {

  public static void parseDateTime(){
    String dateTime= "2017-10-05T13:14";
    System.out.println(LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm")));
    System.out.println(LocalDateTime.parse(dateTime));
    System.out.println(LocalDateTime.parse(dateTime,DateTimeFormatter.ISO_LOCAL_DATE_TIME));

    String dateTime1 = "2017-12-10T13|16";
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH|mm");
    System.out.println(LocalDateTime.parse(dateTime1,dateTimeFormatter));


    String dateTime2 = "2017-12-1213|16";
    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy-MM-ddHH|mm");
    System.out.println(LocalDateTime.parse(dateTime2,dateTimeFormatter1));
  }

  public static void formatDateTime(){

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'abc'HH|mm");
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime.format(dateTimeFormatter));
  }
  public static void main(String[] args) {

    parseDateTime();
    formatDateTime();
  }
}
