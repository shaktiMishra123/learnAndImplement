package emailCheckerAdvanced2;

import java.util.function.Function;
import java.util.regex.Pattern;

public class EmailChecker {

  static Pattern emailCheckerPattern = Pattern.compile("^[a-z0-0._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  static Function<String, Result> emailChecker = (email) ->
  {
    if (email == null)
      return  Result.failure("email cannot be null");
    else if (emailCheckerPattern.matcher(email).matches())
      return  Result.success(email);
    else
      return  Result.failure("email is not valid " + email);

  };

  static Effect<String> success = email -> System.out.println("email sent to " +email);

  static Effect<String> failure = error -> System.err.println("email validation failed :" +error);


  public static void main(String[] args) {
    emailChecker.apply("abc@gmail.com").bind(success,failure);
    emailChecker.apply(null).bind(success,failure);
    emailChecker.apply("abc@gmail").bind(success,failure);

  }
}
