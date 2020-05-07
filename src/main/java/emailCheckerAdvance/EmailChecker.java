package emailCheckerAdvance;

import java.util.function.Function;
import java.util.regex.Pattern;

public class EmailChecker {

  static Pattern emailCheckerPattern = Pattern.compile("^[a-z0-0._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  static Function<String, Result> emailChecker = (email) ->
  {
    if (email == null)
      return  Result.failure("email cannot be null");
    else if (emailCheckerPattern.matcher(email).matches())
      return  Result.success();
    else
      return  Result.failure("email is not valid " + email);

  };

  static Executable validate(String email) {
    Result result = emailChecker.apply(email);
    if (result instanceof Result.Success)
      return new Executable() {
        @Override
        public void exec() {
          success(email);
        }
      };
      else {
      return () -> failure(((Result.Failure)result).getErrorMessage());
    }
  }

  private static void failure(String message) {
    System.err.println(message);
  }

  private static void success(String email) {
    System.out.println("valid mail is : " + email);
  }

  public static void main(String[] args) {
    validate("abc@gmail.com").exec();
    validate(null).exec();
    validate("abc@gmail").exec();

  }
}
