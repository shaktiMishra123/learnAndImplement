package matcher;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Matchers {
  public static <T> Matcher<T> just(boolean result){
    return t -> result;
  }

  public static <T> Matcher<T> and(Collection<Matcher<T>> matchers){
    return t -> matchers.stream().allMatch(matcher -> matcher.test(t));
  }

  public static <T> Matcher<T>  and(Matcher<T> firstMatcher,Matcher<T> secondMatcher){
    return t -> firstMatcher.test(t) && secondMatcher.test(t);
  }

  public static <T> Matcher<T> or(Matcher<T> firstMatcher,Matcher<T> secondMatcher){
    return t -> firstMatcher.test(t) || secondMatcher.test(t);
  }

  public static <T> Matcher<T> or(Matcher<T>... matchers){
    return t -> Arrays.stream(matchers).anyMatch(matcher -> matcher.test(t));
  }

  public static <T> Matcher<T> not(Matcher<T> matcher){
    return t -> ! matcher.test(t);
  }

  public static <T> Matcher<T> any(){
    return t -> true;
  }

  public static <T> Matcher<T> none(){
    return t -> false;
  }

  public static <T> Matcher<T> isInstanceOf(Class<?> clazz){
    return clazz::isInstance;
  }

  public static <T> Matcher<T> isString(){
    return  isInstanceOf(String.class);
  }

  public static <T> Matcher<T> isInteger(){
    return isInstanceOf(Integer.class);
  }
}
