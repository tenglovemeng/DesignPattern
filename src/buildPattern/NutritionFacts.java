package buildPattern;

import java.security.KeyStore;

@SuppressWarnings("AlibabaClassMustHaveAuthor")
public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        private final int servingSize;
        private final int servings;

        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val){
            this.calories = val;
            return this;
        }
        public Builder fat(int val){
            this.fat = val;
            return this;
        }
        public Builder sodium(int val){
            this.sodium = val;
            return this;
        }
        public Builder carbohydrate(int val){
            this.carbohydrate = val;
            return this;
        }

        public NutritionFacts build(){
            return new NutritionFacts(this);
        }

    }
    private NutritionFacts (Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }


    public static void main(String[] args) {
        NutritionFacts cocaCola = new Builder(240, 8).calories(20).carbohydrate(30).build();
    }
}
