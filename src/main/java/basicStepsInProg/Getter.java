package basicStepsInProg;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Getter implements Function<Integer, Integer>, Consumer<String>,Player {

  static Getter getEntry(){
    return new Getter();
  }

  @Override
  public Integer apply(Integer value) {
    return value + value;
  }

  @Override
  public void accept(String s) {
    System.out.println(s.toUpperCase());
  }

  @Override
  public String moveStyle(String style) {
    return style.concat(" is very stylish");
  }

  @Override
  public String goalHitting(String  value) {
    return value.concat(" very fast");
  }

}
