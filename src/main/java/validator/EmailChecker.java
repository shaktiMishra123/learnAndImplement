package validator;

import java.util.function.Function;
import java.util.regex.Pattern;

public class EmailChecker {

  static Pattern emailCheckerPattern = Pattern.compile("^[a-z0-0._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  static Function<String, Validated> emailChecker = (email) ->
  {
    if (email == null)
      return new Validated.Invalid<>("email cannot be null");
    else if (emailCheckerPattern.matcher(email).matches())
      return new Validated.Valid<>();
    else
      return new Validated.Invalid("email is not valid " + email);

  };

  static void validate(String email) {
    Validated result = emailChecker.apply(email);
    result.check();
    if (result instanceof Validated.Valid) {
      success(email);

    } else {
      failure(((Validated.Invalid)result).getErrorMessage());
    }
  }

  private static void failure(String message) {
    System.err.println(message);
  }

  private static void success(String email) {
    System.out.println("valid mail is : " + email);
  }

  public static void main(String[] args) {
    validate("abc@gmail.com");
    validate(null);
    validate("abc@gmail");

  }
}
