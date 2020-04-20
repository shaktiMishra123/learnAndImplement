package basicStepsInProg;

import java.util.function.IntBinaryOperator;

public class BasicCalculatorBinaryOperator {
  private final Integer firstNumber;
  private final Integer secondNumber;
  private final IntBinaryOperator calcFn;


  public BasicCalculatorBinaryOperator(Integer firstNumber, Integer secondNumber, IntBinaryOperator calcFn) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.calcFn = calcFn;
  }

  static BasicCalculatorBinaryOperator calculator(){
    return new BasicCalculatorBinaryOperator(0,0,null);
  }

  public BasicCalculatorBinaryOperator operation(IntBinaryOperator calcFn){
    return new BasicCalculatorBinaryOperator(firstNumber,secondNumber,calcFn);
  }

  public Integer getResult(Integer firstNumber,Integer secondNumber) {
    try {
      return calcFn.applyAsInt(firstNumber,secondNumber);
    }catch (ArithmeticException e){
      throw new RuntimeException("error message : " +e.getMessage());
    }
  }
}
