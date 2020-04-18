package validator;

import java.util.function.Function;

public class Operations<X> {
  private final Function<X,X> operationfn;

  public Operations(Function<X, X> operationfn, int res) {
    this.operationfn = operationfn;
    this.res = res;
  }

  public int getRes() {
    return res;
  }

  private final int res;


  public static <X> Operations<X> create(Function<X, X> fn){
    return new Operations<>(fn,0);
  }

  public static <X> Operations<X> create(Integer result){
    return new Operations<>(null,result);
  }


/*
  private Operations(Function<X, X> operationfn) {
    this.operationfn = operationfn;
  }*/



  public X getResult(X x){
    return operationfn.apply(x);
  }
}
