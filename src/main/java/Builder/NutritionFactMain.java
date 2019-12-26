package Builder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class NutritionFactMain {
  public static void main(String[] args) {

//    NutritionFact nutritionFact = new NutritionFact(12, 11, 10, 10, 3, 3);
//    nutritionFact.sodium = 5000;
//    System.out.println(nutritionFact);

//    NutritionFact defaultObj = new NutritionFact(0,0,0,0,0,0);
//    NutritionFact defaultObject = NutritionFact.DEFAULT();
//    NutritionFact defaultObj2 = new NutritionFact(20,0,0,0,0,0);
//    NutritionFact defaultObject2 = NutritionFact.withServingSize(20);

    NutritionFactBuilder nutritionFactBuilder = NutritionFactBuilder.build(10,20).calories(30).fat(40).carbohydrates(60).sodium(50).build();
    System.out.println(nutritionFactBuilder);
  }

}
