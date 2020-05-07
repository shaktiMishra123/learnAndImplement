package validatorTest;

import java.util.Collection;
import java.util.function.Predicate;

import static validatorTest.Validated.valid;
import static validatorTest.Validated.invalid;

public class Validators {

  public static <T extends Collection> Validated<T> notEmpty(T t, String name) {
    return (Validated<T>) notEmpty().name(name).apply(t);
  }

  public static <T extends Collection> Validator<T, T> notEmpty() {
    System.out.println("called1");
    return Validators.<T>check(v -> v != null && !v.isEmpty()).template("'%s' collection should not be empty");
  }

  public static <T> Validator<T, T> check(Predicate<? super T> p) {
    System.out.println("called2");  // BiFunction definition
    return new Validator<>((t,msg) -> p.test(t) ? valid(t) : invalid(new Failure(msg)));
  }
}
