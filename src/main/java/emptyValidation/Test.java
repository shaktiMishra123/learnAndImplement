package emptyValidation;

import java.util.Objects;

public class Test {

  private int a =10;
  private static final int DEFAULT_A = 15;

  public Test(int a) {
    this.a = a;
  }

  public static  Test withDefaults(){
    return new Test(DEFAULT_A);
  }

  public boolean isDefault(){
    return equals(withDefaults());
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Test test = (Test) o;
    return a == test.a;
  }

  @Override
  public int hashCode() {
    return Objects.hash(a);
  }
}
