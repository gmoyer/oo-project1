public class Brewery {

    Inventory inventory;
    ContainerManager containerManager;
    Library library;

    public Brewery(){
        inventory = new Inventory();
        containerManager = new ContainerManager(5);
        library = new Library();
    }

    public static void main(String args[]){
        Brewery brewery = new Brewery();

        // Add ingredients to inventory
        brewery.inventory.addIngredient(new Ingredient("apple", 100));
        brewery.inventory.addIngredient(new Ingredient("flour", 100));
        brewery.inventory.addIngredient(new Ingredient("sugar", 100));
        brewery.inventory.addIngredient(new Ingredient("wheat", 100));
        brewery.inventory.addIngredient(new Ingredient("water", 100));
        brewery.inventory.addIngredient(new Ingredient("yeast", 100));

        brewery.inventory.printInventory();

        // Create recipes
        Recipe recipe1 = new Recipe("apple pie", 5);
        recipe1.addIngredient(new Ingredient("apple", 3));
        recipe1.addIngredient(new Ingredient("flour", 2));
        recipe1.addIngredient(new Ingredient("sugar", 1));
        recipe1.printRecipe();

        Recipe recipe2 = new Recipe("beer", 20);
        recipe2.addIngredient(new Ingredient("wheat", 5));
        recipe2.addIngredient(new Ingredient("water", 10));
        recipe2.addIngredient(new Ingredient("yeast", 1));
        recipe2.printRecipe();

        // Add recipes to library
        brewery.library.addRecipe(recipe1);
        brewery.library.addRecipe(recipe2);

        // Create batches
        brewery.createBatch(brewery.library.getRecipe("apple pie"), 10);
        brewery.createBatch(brewery.library.getRecipe("beer"), 20);
        brewery.createBatch(brewery.library.getRecipe("apple pie"), 200); // This requires a restock
        brewery.createBatch(brewery.library.getRecipe("beer"), 10);
        brewery.createBatch(brewery.library.getRecipe("beer"), 40);
        brewery.createBatch(brewery.library.getRecipe("beer"), 20); // This requires batch cleaning

        // Print inventory
        brewery.inventory.printInventory();
    }

    public void createBatch(Recipe recipe, int servings){
        System.out.println("Creating batch of " + recipe.name + " for " + servings + " servings");
        List<Ingredient> ingredients = recipe.getIngredients(servings);
        for(int i = 0; i < ingredients.size; i++){
            inventory.remove(ingredients.get(i));
            System.out.println("Used " + ingredients.get(i));
        }
        Container container = containerManager.getCleanContainer(); // get a container to put the batch in
        container.use();
        System.out.println("Batch created!\n");
    }

}
