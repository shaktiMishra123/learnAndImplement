package emptyValidation;

import validatorTest.Failure;

public interface Validated<T> {


  static <E> Validated<E> valid(E val) {
    return new Valid<>(val);
  }

  static <E> Validated<E> invalid(Failure e) {
    return new Invalid<>(e);
  }

  void check();

  class Valid<T> implements Validated<T> {
    private final T val;

    Valid(T val) {
      this.val = val;
    }

    @Override
    public void check() {
      // ignored for Valid
    }
  }

  class Invalid<T> implements Validated<T> {

    private final Failure failure;

    Invalid(Failure failure) {
      this.failure = failure;
    }

    @Override
    public void check() {
      throw new RuntimeException("Validation failed: " + failure);
    }
  }
}
