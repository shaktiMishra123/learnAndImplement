package basicStepsInProg;

import java.util.function.Function;

import static basicStepsInProg.EmailChecker.emailCheckerPattern;

public class EmailCheckerFunction  implements Function<String,Validator> {

  static EmailCheckerFunction entry(){
    return new EmailCheckerFunction();
  }

  @Override
  public Validator apply(String email) {
    if(email == null)
      return new Validator.Invalid("value is null");
    else if(emailCheckerPattern.matcher(email).matches())
      return  new Validator.Valid();
    else
      return  new Validator.Invalid("provided email is wrong " +email);
  }
}
