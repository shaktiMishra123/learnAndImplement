package basicStepsInProg;

public class CalculatorMain {
  public static void main(String[] args) {
    Integer addition = BasicCalculator.calculator().operation((x, y) -> x + y).getResult(10,20);
    System.out.println(addition);

    Integer subtraction = BasicCalculator.calculator().operation((x, y) -> x - y).getResult(10,20);
    System.out.println(subtraction);

    Integer division = BasicCalculator.calculator().operation((x, y) -> x / y).getResult(10,0);
    System.out.println(division);

    Integer multiplication = BasicCalculator.calculator().operation((x, y) -> x * y).getResult(10,20);
    System.out.println(multiplication);

    Integer additionUsingIntBinaryOptr = BasicCalculatorBinaryOperator.calculator().operation((x,y) -> x + y).getResult(12,10);
    System.out.println(additionUsingIntBinaryOptr);






  }
}
