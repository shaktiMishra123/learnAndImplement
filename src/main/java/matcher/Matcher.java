package matcher;

import java.util.function.Predicate;

@FunctionalInterface
public interface Matcher<T> extends Predicate<T> {

}
