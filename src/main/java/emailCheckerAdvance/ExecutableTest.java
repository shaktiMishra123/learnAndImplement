package emailCheckerAdvance;

public class ExecutableTest   {
  public static Validated emptyCheck(String string){
    return () -> {
      new Validated() {
        @Override
        public void check() {

        }
      };
    };
  };
}
