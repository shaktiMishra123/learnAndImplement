package emailCheckerAdvance;

public interface Result<T> {

  static <T> Result<T> success(){
    return new Success<>();
  }

  static <T> Result<T> failure(String errorMessage){
    return new Failure<>(errorMessage);
  }

  public class Success<T> implements Result<T> {
  }

   class Failure<T> implements Result<T> {
    private final String errorMessage;

    private Failure(String errorMessage) {
      this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
      return errorMessage;
    }

  }
}
