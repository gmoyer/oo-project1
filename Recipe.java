public class Recipe {
    List<Ingredient> ingredients;
    String name;
    int servings;

    public Recipe(String name, int servings){
        this.name = name;
        this.servings = servings;
        this.ingredients = new List<Ingredient>();
    }

    // Add an ingredient to the recipe
    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    // Print the recipe to the console
    public void printRecipe(){
        System.out.println("Recipe: " + name);
        System.out.println("Servings: " + servings);
        for(int i = 0; i < ingredients.size; i++){
            System.out.println(ingredients.get(i));
        }
        System.out.println();
    }

    // Get the ingredients for a certain number of servings.
    // Calculates based off of a ratio of the provided servings to the original servings
    public List<Ingredient> getIngredients(int servings){
        List<Ingredient> newIngredients = new List<Ingredient>();
        for(int i = 0; i < ingredients.size; i++){
            Ingredient ingredient = ingredients.get(i);
            int newQuantity = ingredient.quantity * servings / this.servings;
            newIngredients.add(new Ingredient(ingredient.name, newQuantity));
        }
        return newIngredients;
    }
}
