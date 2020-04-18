/*
package useCasesUsingFunctionalPrograming.wordRepetition;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.w3c.dom.ranges.Range;

class Recursion{
private final String test;
private final String abc;

  Recursion(String test, String abc) {
    this.test = test;
    this.abc = abc;
    ScheduledThreadPoolExecutor executor = (ScheduledThreadPoolExecutor) Executors.newScheduledThreadPool(1);

  }

  public static void main(String[] args) {

     final AtomicBoolean isRunning = new AtomicBoolean(false);
    System.out.println(isRunning);
    isRunning.set(true);
    System.out.println(isRunning);
    System.out.println(!isRunning.getAndSet(true));

    String fullpath = "gs://es-s2dl-core-d-tla-agent-config/checkpoints/";
    String path = fullpath.substring("gs://".length());
    System.out.println(path);
    String[] parts = path.split("/", 2);
    System.out.println(parts[1]);
    String bucket = parts[0];
    String location = parts.length > 1 ? parts[1] : "";
    System.out.println(bucket);
    System.out.println(location);
    System.out.println(parts.length);
    String fileName = "local/admin_trailer_alerts.checkpoint";

    System.out.println(Tuple.of(bucket,location).map2(folder -> folder.endsWith("/") ? folder + fileName : folder + "/" + fileName));







  }
}
*/
