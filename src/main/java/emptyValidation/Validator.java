package emptyValidation;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Validator<T,R> implements Function<T,Validated<R>> {

  private final BiFunction<T,Message,Validated<R>> fn;
  private final Message message;

  private Validator(BiFunction<T, Message, Validated<R>> fn, Message message) {
    this.fn = fn;
    this.message = message;
  }

  public Validator(BiFunction<T,Message,Validated<R>> fn){
     this(fn,Message.withDefaults());
  }

  @Override
  public Validated<R> apply(T t) {
    return fn.apply(t,message);
  }

  public Validator<T,R> message(Message message){
    return new Validator<>(fn,message);
  }

  public Validator<T,R> template(String template){
    return message(message.template(template));
  }

  public Validator<T,R> arg(Object... args){
    return message(message.args(args));
  }

  public Validator<T,R> name(String name){
    return arg(name);
  }


}
