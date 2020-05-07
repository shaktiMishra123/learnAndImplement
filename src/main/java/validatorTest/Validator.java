package validatorTest;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Validator<T, R> implements Function<T, Validated<R>> {

  private final BiFunction<T, Message, Validated<R>> fn;
  private final Message message;

  private Validator(BiFunction<T, Message, Validated<R>> fn, Message message) {
    this.fn = fn;
    this.message = message;
  }

  public Validator(BiFunction<T, Message, Validated<R>> fn) {
    this(fn, Message.withDefaults());
  }

  public  static Validator getAccess(){
    return new Validator(null);
  }

  @Override
  public Validated<R> apply(T t) {
    System.out.println("test");
    return fn.apply(t, message);
  }

  public Validator<T, R> template(String tpl) {
    System.out.println("called 4");
    return message(message.template(tpl));
  }

  public Validator<T, R> name(String name) {
    System.out.println("called3");
    return args(name);
  }

  public Validator<T, R> args(Object... args) {
    return message(message.args(args));
  }

  public Validator<T, R> message(Message message) {
    return new Validator<>(fn, message);
  }
}
