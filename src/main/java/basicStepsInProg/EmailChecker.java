package basicStepsInProg;

import java.util.regex.Pattern;

public class EmailChecker {
  static Pattern emailCheckerPattern = Pattern.compile("^[a-z0-0._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$");

  static void validate(String email){
    Validator result = EmailCheckerFunction.entry().apply(email);
    result.check();
    if(result instanceof Validator.Valid){
     success(email);
    }
    else
      failure(((Validator.Invalid) result).getErrorMessage());

  }

  private static void success(String email) {
    System.out.println("mail is valid email " +email);
  }

  private static void failure(String message){
    System.out.println("email validation failed :" +message);
  }

  public static void main(String[] args) {
    validate("shakti@gmail.com");
    validate("shakti@gmail.com1");
    validate(null);
  }
}