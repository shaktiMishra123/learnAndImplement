package useCasesUsingFunctionalPrograming.ControlAsFunctional;

import java.util.function.Function;
import java.util.regex.Pattern;

public class EmailValidator {
  static final Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$*");
  static private Function<String, Result> isValidMail = email -> {
    return (email == null)
        ? Result.failure("email ID cannot be null")
        : (email.length() == 0)
        ? Result.failure("Email ID cannot be empty")
        : (emailPattern.matcher(email).matches())
        ? Result.success(email)
        : Result.failure("Not a valid Email");
  };

  private static Effect<String> success = s -> System.out.println("mail sent to " + s);
  private static Effect<String> failure = s -> System.err.println("Error message logged: " + s);

  public static void main(String[] args) {
    isValidMail.apply("abc@gmail.com").bind(success, failure);
    isValidMail.apply(null).bind(success, failure);
    isValidMail.apply("").bind(success, failure);
    isValidMail.apply("@@@@@@").bind(success, failure);
  }
}
