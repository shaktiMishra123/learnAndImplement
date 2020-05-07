package java8DateTimeLibrary;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class ComparingTime {
  public static void main(String[] args) {
    LocalTime localTime = LocalTime.now();
    System.out.println(Duration.between(localTime,localTime.plusHours(1)).getSeconds());
    System.out.println(Duration.between(localTime,localTime.plusHours(1)).toMinutes());
    System.out.println(Duration.between(localTime,localTime.plusHours(1)).toHours());
    System.out.println(Duration.between(localTime,localTime.plusHours(1)).toDays());
  }
}
