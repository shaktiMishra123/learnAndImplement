package useCasesUsingFunctionalPrograming.ControlAsFunctional;

public interface Effect<T> {
  void apply(T t);
}
