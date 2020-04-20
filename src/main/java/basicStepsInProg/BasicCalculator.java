package basicStepsInProg;

import java.util.function.BiFunction;

public class BasicCalculator {
  private final Integer firstNumber;
  private final Integer secondNumber;
  private final BiFunction<Integer,Integer,Integer> calcFn;

  public BasicCalculator(Integer firstNumber, Integer secondNumber, BiFunction<Integer, Integer, Integer> calcFn) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.calcFn = calcFn;
  }

  static BasicCalculator calculator(){
    return new BasicCalculator(0,0,null);
  }

  public BasicCalculator operation(BiFunction<Integer,Integer,Integer> calcFn){
    return new BasicCalculator(firstNumber,secondNumber,calcFn);
  }

  public Integer getResult(Integer firstNumber,Integer secondNumber) {
    try {
      return calcFn.apply(firstNumber,secondNumber);
    }catch (ArithmeticException e){
      throw new RuntimeException("error message : " +e.getMessage());
    }

  }
}
