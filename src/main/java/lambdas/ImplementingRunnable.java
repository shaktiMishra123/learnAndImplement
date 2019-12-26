package lambdas;

public class ImplementingRunnable {
  public static void main(String[] args) {

    // before java 8
    Runnable runnable = new Runnable() {
      @Override
      public void run() {
        System.out.println("Runnable 1");
      }
    };
    new Thread(runnable).start();

    //After java 8
    Runnable runnableLambda = () -> System.out.println("Runnable Lembda");
    new Thread(runnableLambda).start();
  }

}
