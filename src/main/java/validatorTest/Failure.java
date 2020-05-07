package validatorTest;

import io.vavr.collection.List;

public class Failure {
  private final List<String> errors;
  public Failure(List<String> errors) {
    this.errors = errors;
  }

  public Failure(Message error) {
    this(List.of(error.toString()));
  }

}
