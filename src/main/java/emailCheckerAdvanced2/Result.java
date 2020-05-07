package emailCheckerAdvanced2;

public interface Result<T> {

  void bind(Effect<T> success, Effect<T> failure );

  static <T> Result<T> success(T value){
    return new Success<>(value);
  }

  static <T> Result<T> failure(T value){
    return new Failure<>(value);
  }

  public class Success<T> implements Result<T> {
    private final T value;

    public Success(T value) {
      this.value = value;
    }

    @Override
    public void bind(Effect<T> success, Effect<T> failure) {
      success.apply(value);
    }
  }

   class Failure<T> implements Result<T> {
    private final T value;

    private Failure(T value) {
      this.value = value;
    }


     @Override
     public void bind(Effect<T> success, Effect<T> failure) {
       failure.apply(value);
     }
   }
}
