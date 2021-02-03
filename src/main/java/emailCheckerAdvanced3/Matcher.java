package emailCheckerAdvanced3;

import java.util.function.Supplier;

public class Matcher<T>  extends  Tuple<Supplier<Boolean>,Supplier<Result<T>>>{


  public Matcher(Supplier<Boolean> _1, Supplier<Result<T>> _2) {
    super(_1, _2);
  }

  static <T> Matcher<T> mCase(Supplier<Boolean> condition, Supplier<Result<T>> Result){
    return new Matcher<>(condition,Result);
  }

  static <T> DefaultMatcher<T> mCase(Supplier<Result<T>> resultSupplier){
    return new DefaultMatcher<>(() -> true,resultSupplier);
  }

  public static class DefaultMatcher<T> extends Matcher<T>{
    public DefaultMatcher(Supplier<Boolean> _1, Supplier<Result<T>> _2) {
      super(_1, _2);
    }
  }

  public static <T> Result<T> match(DefaultMatcher<T> defaultMatcher, Matcher<T>... matchers){
    for (Matcher<T> matcher : matchers){
      if(matcher._1.get() == true){
        return matcher._2.get();
      }
    }
    return defaultMatcher._2.get();
  }
}
