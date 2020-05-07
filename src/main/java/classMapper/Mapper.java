package classMapper;

import java.util.function.Function;

public interface Mapper<Integer> extends Function<Integer,Integer> {

  @SuppressWarnings("unchecked")
  static <E> Mapper<E> ofClass(String name) {
    try {
      return (Mapper<E>) Class.forName(name).newInstance();
    } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
