package validator;

public interface Validated<T> {

  void check();
  public class Valid<T> implements Validated<T>{
    @Override
    public void check() {

    }
  }
  public class Invalid<T> implements Validated<T>{
    private final String errorMessage;

    public Invalid(String errorMessage) {
      this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
      return errorMessage;
    }

    @Override
    public void check() {
      throw new RuntimeException(errorMessage);
    }
  }


}
