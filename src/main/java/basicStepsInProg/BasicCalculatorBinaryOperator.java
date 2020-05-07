package basicStepsInProg;

import java.util.function.IntBinaryOperator;

public class BasicCalculatorBinaryOperator {
  private final Integer firstNumber;
  private final Integer secondNumber;
  private final IntBinaryOperator calcFn;

  public Integer getFirstNumber() {
    return firstNumber;
  }

  public Integer getSecondNumber() {
    return secondNumber;
  }




  public BasicCalculatorBinaryOperator(Integer firstNumber, Integer secondNumber, IntBinaryOperator calcFn) {
    this.firstNumber = firstNumber;
    this.secondNumber = secondNumber;
    this.calcFn = calcFn;
  }

   static BasicCalculatorBinaryOperator setOperation(IntBinaryOperator calcFn){
    return new BasicCalculatorBinaryOperator(0,0,calcFn);
  }

   public static BasicCalculatorBinaryOperator setFirstNumber(Integer value){
    return new BasicCalculatorBinaryOperator(value,0,null);
  }

   public static BasicCalculatorBinaryOperator setSecondNumber(Integer value){
    return new BasicCalculatorBinaryOperator(0,value,null);
  }

  public Integer getResult(Integer firstNumber,Integer secondNumber) {
    try {
      return calcFn.applyAsInt(firstNumber,secondNumber);
    }catch (ArithmeticException e){
      throw new RuntimeException("error message : " +e.getMessage());
    }
  }
}
