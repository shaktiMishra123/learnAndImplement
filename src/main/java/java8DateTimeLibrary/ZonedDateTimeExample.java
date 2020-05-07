package java8DateTimeLibrary;

import java.time.*;

public class ZonedDateTimeExample {
  static int count = 0;

  public static void main(String[] args) {
    ZonedDateTime zonedDateTime = ZonedDateTime.now();
    System.out.println(zonedDateTime);
    System.out.println(zonedDateTime.getOffset());
    System.out.println(zonedDateTime.getZone());
    System.out.println(ZoneId.getAvailableZoneIds());


    ZoneId.getAvailableZoneIds().stream().forEach(x ->
        {
          if (x.contains("Asia")) {
            count++;
            System.out.println(x);
          }
        }
    );
    System.out.println(count);

    System.out.println(ZoneId.getAvailableZoneIds().size());

    System.out.println(ZonedDateTime.now(ZoneId.of("America/Chicago")));
    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Singapore")));

    System.out.println(LocalDateTime.now(ZoneId.of("Asia/Singapore")));
    System.out.println(LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault()));

    System.out.println(ZonedDateTime.now(ZoneId.of("Asia/Singapore")));

    /**
     * Converting instant to ZonedDateTime
     */

    Instant instant = Instant.now();
    System.out.println(instant.atZone(ZoneId.systemDefault()));

    /**
     * Converting localDateTime to ZonedDateTime
     */

    System.out.println(LocalDateTime.now().atZone(ZoneId.systemDefault()));

    System.out.println(LocalDateTime.now(ZoneId.systemDefault()));

    OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneId.systemDefault());
    System.out.println(offsetDateTime);
  }


}
