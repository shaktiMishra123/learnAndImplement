package Shakti;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OperationMain {
  public static void main(String[] args) {

    Integer opn = Operation.getSum(x -> x + x).sum(10);
    System.out.println(opn);

    Integer opn1 = Operation.getSum(null).getValue(10).getResult();
    System.out.println(opn1);

    Map<String,String> stringMap = new HashMap<>();
    stringMap.put("A","B");

    Operation.getSum(null).getMap(stringMap).getNameMap();
    System.out.println(Operation.getSum(null).getMap(stringMap).getNameMap());

    List<String> friendList = Arrays.asList("A","B","C","D");
    Operation.getSum(null).getList(friendList).getFriendList();
    System.out.println(Operation.getSum(null).getList(friendList).getFriendList());

    System.out.println(Getter.getEntry().apply(50));
    Getter.getEntry().accept("shakti");

    System.out.println(Getter.getEntry().moveStyle("messy"));
    System.out.println(Getter.getEntry().goalHitting("messy is hitting goal"));


  }



}