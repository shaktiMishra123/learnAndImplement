package basicStepsInProg;

public interface Validator {


  void check();
  public class Valid implements Validator{
    @Override
    public void check() {

    }
  }

  public class Invalid implements Validator{
    private final String errorMessage;

    public String getErrorMessage() {
      return errorMessage;
    }

    public Invalid(String errorMessage) {
      this.errorMessage = errorMessage;
    }


    @Override
    public void check() {
      throw new RuntimeException(errorMessage);
    }
  }
}
