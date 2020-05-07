package extractFileNameFromGCSFullName;

import io.vavr.control.Try;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;
import java.util.stream.Stream;

import static java.time.format.DateTimeFormatter.ISO_ZONED_DATE_TIME;

public class FileFullName {
  public static void main(String[] args) {
    System.out.println(extractFileName("gs://test/bucket/DWH_XYZ_201705022027.txt",".txt"));
    String patterns = "yyyyMMddHHmm,yyyyMMddHH,yyyyMMdd[HHmm]";
    DateTimeFormatter dateTimeFormatter = Stream.of(patterns.split(","))
        .map(pattern -> String.format("[%s]",pattern) )
        .collect(DateTimeFormatterBuilder::new, DateTimeFormatterBuilder::appendPattern, (b1, b2) -> {})
        .parseDefaulting(ChronoField.HOUR_OF_DAY, 0)
        .parseDefaulting(ChronoField.MINUTE_OF_HOUR, 0)
        .parseDefaulting(ChronoField.SECOND_OF_MINUTE, 0)
        .toFormatter();

    System.out.println(extractProcessTime("DWH_XYZ_201705022027", dateTimeFormatter,ZoneId.of("UTC")));
  }

   static String extractFileName(String fileFullName , String fileSuffix) {
    if (fileFullName == null || fileFullName.length() < fileSuffix.length()) {
      return fileFullName;
    } else {
      int start = fileFullName.lastIndexOf('/') + 1;
      return fileFullName.substring(start, fileFullName.length() - fileSuffix.length());
    }
  }

  static Try<String> extractProcessTime(String fileName, DateTimeFormatter timeStampFormat, ZoneId zoneId) {
    return Try.of(() -> {
      int idx = fileName.lastIndexOf("_");
      System.out.println(idx);
      //Preconditions.checkArgument(idx > 0, "File does not contain processing timestamp: " + fileName);
      return LocalDateTime
          .parse(fileName.substring(idx + 1), timeStampFormat)
          .atZone(zoneId)
          .withZoneSameInstant(ZoneOffset.UTC)
          .format(ISO_ZONED_DATE_TIME);
    });
  }
}
