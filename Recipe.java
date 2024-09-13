public class Recipe {
    List<Ingredient> ingredients;
    String name;
    int servings;

    public Recipe(String name, int servings){
        this.name = name;
        this.servings = servings;
        this.ingredients = new List<Ingredient>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public void printRecipe(){
        System.out.println("Recipe: " + name);
        System.out.println("Servings: " + servings);
        for(int i = 0; i < ingredients.size; i++){
            System.out.println(ingredients.get(i));
        }
    }
}
