package basicStepsInProg;

import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class Operation{

  private final Function<Integer,Integer> Intfn;
  private final Integer result;
  private final Map<String,String>  nameMap;
  private final List<String> friendsList;

  public Operation(Function<Integer, Integer> intfn, Integer result, Map<String, String> nameMap, List<String> friendsList) {
    Intfn = intfn;
    this.result = result;
    this.nameMap = nameMap;
    this.friendsList = friendsList;
  }


  public Integer getResult() {
    return result;
  }

   static Operation getSum(Function<Integer,Integer> intfn){
    return new Operation(intfn,0,null,null);
   }

   public Integer sum(Integer x){
    return Intfn.apply(x);
   }

   public Operation getValue(Integer value){
    return new Operation(Intfn,value,nameMap,friendsList);
   }

   public Operation getMap(Map mapValue){
    return new Operation(Intfn,result,mapValue,friendsList);
   }

  public Map<String, String> getNameMap() {
    return nameMap;
  }

  public Operation getList(List<String> stringList){
    return new Operation(Intfn,result,nameMap,stringList);
  }

  public List<String> getFriendList(){
    return friendsList;
  }
}