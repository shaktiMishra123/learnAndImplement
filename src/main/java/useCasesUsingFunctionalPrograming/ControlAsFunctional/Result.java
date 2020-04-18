package useCasesUsingFunctionalPrograming.ControlAsFunctional;

public interface Result<T> {
   void bind(Effect<T> success , Effect<String> failure);

   public static <T> Result<T> success(T value){
     return new Success<>(value);
   }

   public static <T> Result<T> failure(String value){
     return new Failure<>(value);
   }

  public class Success<T> implements Result<T>{
    private final T value;

    public Success(T value) {
      this.value = value;
    }

    @Override
    public void bind(Effect<T> success, Effect<String> failure) {
        success.apply(this.value);
    }
  }

  public class Failure<T> implements Result<T>{
    private final String errorMessage;

    public Failure(String errorMessage) {
      this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
      return errorMessage;
    }

    @Override
    public void bind(Effect<T> success, Effect<String> failure) {
      failure.apply(this.errorMessage);
    }
  }
}
