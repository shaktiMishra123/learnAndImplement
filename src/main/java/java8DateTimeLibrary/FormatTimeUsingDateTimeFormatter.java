package java8DateTimeLibrary;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FormatTimeUsingDateTimeFormatter {
  public static void parseTime(){
    String time = "13:00";

    System.out.println(LocalTime.parse(time));
    System.out.println(LocalTime.parse(time, DateTimeFormatter.ISO_LOCAL_TIME));
    System.out.println(LocalTime.parse(time,DateTimeFormatter.ofPattern("HH:mm")));
    String time1 = "12+12";
    System.out.println(LocalTime.parse(time1,DateTimeFormatter.ofPattern("HH+mm")));
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH+mm");
    System.out.println(LocalTime.parse(time1,dateTimeFormatter));
  }

  public static void formatTime(){
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH+mm");
    LocalTime localTime = LocalTime.of(12,13);
    System.out.println(localTime.format(dateTimeFormatter));
  }
  public static void main(String[] args) {
    parseTime();
    formatTime();

  }
}
