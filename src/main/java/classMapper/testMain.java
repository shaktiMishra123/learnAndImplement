package classMapper;

public class testMain {
  public static void main(String[] args) {

    System.out.println(predicateTest.check(x -> x !=10).getResult(11));
    System.out.println(Mapper.ofClass("nullCheck.MapperTest"));

  }
}
