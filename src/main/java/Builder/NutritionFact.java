package Builder;

public class NutritionFact {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrates;

  private NutritionFact(int servingSize, int servings, int calories, int fat, int sodium, int carbohydrates) {
    this.servingSize = servingSize;
    this.servings = servings;
    this.calories = calories;
    this.fat = fat;
    this.sodium = sodium;
    this.carbohydrates = carbohydrates;
  }

  public static NutritionFact DEFAULT(){
    return new NutritionFact(0,0,0,0,0,0);
  }

  public static NutritionFact withServingSize(int value){
    return new NutritionFact(value,0,0,0,0,0);
  }

  @Override
  public String toString() {
    return "NutritionFact{" +
        "servingSize=" + servingSize +
        ", servings=" + servings +
        ", calories=" + calories +
        ", fat=" + fat +
        ", sodium=" + sodium +
        ", carbohydrates=" + carbohydrates +
        '}';
  }
}
