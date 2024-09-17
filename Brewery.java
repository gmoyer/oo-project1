public class Brewery {

    Inventory inventory;

    public Brewery(){
        inventory = new Inventory();
    }

    public static void main(String args[]){
        Ingredient ingredient = new Ingredient("apple", 20);
        Ingredient ingredient1 = new Ingredient("flour", 10);
        Ingredient ingredient2 = new Ingredient("sugar", 10);

        Ingredient ingredient3 = new Ingredient("wheat", 50);
        Ingredient ingredient4 = new Ingredient("water", 100);
        Ingredient ingredient5 = new Ingredient("yeast", 15);
        Library library = new Library();
        Recipe recipe1 = new Recipe("apple pie", 5);
        recipe1.addIngredient(ingredient);
        recipe1.addIngredient(ingredient1);
        recipe1.addIngredient(ingredient2);
        Recipe recipe2 = new Recipe("beer",20);
        recipe2.addIngredient(ingredient3);
        recipe2.addIngredient(ingredient4);
        recipe2.addIngredient(ingredient5);
        recipe2.printRecipe();
        System.out.println();
        library.addRecipe(recipe1);
        library.addRecipe(recipe2);
        //library.printRecipeList();
        //library.removeRecipe(recipe1);
        library.printRecipeList();
        System.out.println(library.getRecipe("apple pie"));








    }

    public void createBatch(Recipe recipe, int servings){
        List<Ingredient> ingredients = recipe.getIngredients(servings);
        for(int i = 0; i < ingredients.size; i++){
            inventory.remove(ingredients.get(i));
        }
    }

}
