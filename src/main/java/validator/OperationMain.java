package validator;



public class OperationMain {
  public static void main(String[] args) {
    Operations doubleOperation = Operations.<Integer>create(x -> x+x);

    System.out.println( doubleOperation.getResult(10));

    Operations sampleOperations = Operations. <Integer>create(x -> x * x);

    Operations test = Operations.create(10);
    System.out.println(test.getRes());


  }
}
