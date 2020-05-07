package emailCheckerAdvanced2;

public interface Effect<T> {
  public void apply(T t);
}
