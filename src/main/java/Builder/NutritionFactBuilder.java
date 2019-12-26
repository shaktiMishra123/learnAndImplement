package Builder;

public class NutritionFactBuilder {
  private final int servingSize;
  private final int servings;
  private final int calories;
  private final int fat;
  private final int sodium;
  private final int carbohydrates;

  public NutritionFactBuilder(Builder builder) {
    servingSize = builder.servingSize;
    servings = builder.servings;
    calories = builder.calories;
    fat = builder.fat;
    sodium = builder.sodium;
    carbohydrates = builder.carbohydrates;
  }

  public static Builder build(int servingSize,int servings){
    return new NutritionFactBuilder.Builder(servingSize,servings);
  }


  public static  class Builder{
    private final int servingSize;
    private final int servings;
    private  int calories = 0;
    private  int fat= 0;
    private  int sodium =0 ;
    private  int carbohydrates = 0;


    public Builder(int servingSize, int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    public Builder calories(int value){
      calories = value;
      return this;
    }

    public Builder fat(int value){
     fat = value;
      return this;
    }

    public Builder sodium(int value){
     sodium = value;
      return this;
    }

    public Builder carbohydrates(int value){
     carbohydrates = value;
      return this;
    }

    public NutritionFactBuilder build(){
      return new NutritionFactBuilder(this);
    }
  }


  @Override
  public String toString() {
    return "NutritionFactBuilder{" +
        "servingSize=" + servingSize +
        ", servings=" + servings +
        ", calories=" + calories +
        ", fat=" + fat +
        ", sodium=" + sodium +
        ", carbohydrates=" + carbohydrates +
        '}';
  }


}
