package basicStepsInProg;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import validatorTest.Validator;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Test {

  public static void  test(){

  }




  static Function<String, Validator> name = (name) ->  Validator.getAccess().name(name) ;

  public static void main(String[] args) {
    System.out.println(name.apply("test"));



  }
}

