package emailCheckerAdvance;

public interface Validated {
  void check();
  public class Valid implements Validated{
    @Override
    public void check() {

    }

    public class Invalid implements Validated{
      @Override
      public void check() {
        System.out.println("invalid");
      }
    }
  }
}
