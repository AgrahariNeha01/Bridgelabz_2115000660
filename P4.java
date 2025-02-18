

interface MealPlan {
    String getMealType();
}

class VegetarianMeal implements MealPlan {
    public String getMealType() { return "Vegetarian"; }
}

class VeganMeal implements MealPlan {
    public String getMealType() { return "Vegan"; }
}

class KetoMeal implements MealPlan {
    public String getMealType() { return "Keto"; }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() { return "High-Protein"; }
}

class Meal<T extends MealPlan> {
    String name;
    T type;

    Meal(String name, T type) {
        this.name = name;
        this.type = type;
    }

    void show() {
        System.out.println(name + " - " + type.getMealType());
    }
}

class MealPlanner {
    static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating meal plan for: " + meal.getMealType());
    }
}

public class P4 {
    public static void main(String[] args) {
        Meal<VegetarianMeal> m1 = new Meal<>("Salad Bowl", new VegetarianMeal());
        Meal<VeganMeal> m2 = new Meal<>("Tofu Stir Fry", new VeganMeal());
        Meal<KetoMeal> m3 = new Meal<>("Grilled Chicken", new KetoMeal());
        Meal<HighProteinMeal> m4 = new Meal<>("Egg Scramble", new HighProteinMeal());

        System.out.println("Available Meal Plans:");
        m1.show();
        m2.show();
        m3.show();
        m4.show();

        System.out.println("\nGenerating Personalized Plans:");
        MealPlanner.generateMealPlan(m1.type);
        MealPlanner.generateMealPlan(m2.type);
        MealPlanner.generateMealPlan(m3.type);
        MealPlanner.generateMealPlan(m4.type);
    }
}
