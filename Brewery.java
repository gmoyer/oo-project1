public class Brewery {
    // could move ingredient names and recipes to two enums or move these to
    // a different class to improve Brewery cohesion
    public static final String APPLE = "apple";
    public static final String FLOUR = "flour";
    public static final String SUGAR = "sugar";
    public static final String WHEAT = "wheat";
    public static final String WATER = "water";
    public static final String YEAST = "yeast";
    public static final String APPLE_PIE = "apple pie";
    public static final String BEER = "beer";

    Inventory inventory;
    ContainerManager containerManager;
    Library library;

    public Brewery(){
        inventory = new Inventory();
        containerManager = new ContainerManager(5);
        library = new Library();
    }

    // Main method that creates a brewery and runs some tests
    public static void main(String args[]){
        Brewery brewery = new Brewery();

        // Add ingredients to inventory
        brewery.inventory.addIngredient(new Ingredient(APPLE, 100));
        brewery.inventory.addIngredient(new Ingredient(FLOUR, 100));
        brewery.inventory.addIngredient(new Ingredient(SUGAR, 100));
        brewery.inventory.addIngredient(new Ingredient(WHEAT, 100));
        brewery.inventory.addIngredient(new Ingredient(WATER, 100));
        brewery.inventory.addIngredient(new Ingredient(YEAST, 100));

        brewery.inventory.printInventory();

        // Create recipes
        Recipe recipe1 = new Recipe(APPLE_PIE, 5);
        recipe1.addIngredient(new Ingredient(APPLE, 3));
        recipe1.addIngredient(new Ingredient(FLOUR, 2));
        recipe1.addIngredient(new Ingredient(SUGAR, 1));
        recipe1.printRecipe();

        Recipe recipe2 = new Recipe(BEER, 20);
        recipe2.addIngredient(new Ingredient(WHEAT, 5));
        recipe2.addIngredient(new Ingredient(WATER, 10));
        recipe2.addIngredient(new Ingredient(YEAST, 1));
        recipe2.printRecipe();

        // Add recipes to library
        brewery.library.addRecipe(recipe1);
        brewery.library.addRecipe(recipe2);

        // Create batches
        brewery.createBatch(brewery.library.getRecipe(APPLE_PIE), 10);
        brewery.createBatch(brewery.library.getRecipe(BEER), 20);
        brewery.createBatch(brewery.library.getRecipe(APPLE_PIE), 200); // This requires a restock
        brewery.createBatch(brewery.library.getRecipe(BEER), 10);
        brewery.createBatch(brewery.library.getRecipe(BEER), 40);
        brewery.createBatch(brewery.library.getRecipe(BEER), 20); // This requires batch cleaning

        // testing error handling
//        brewery.createBatch(brewery.library.getRecipe("nonexistent"), 10); // results in NPE
        // test 0 servings
        brewery.createBatch(brewery.library.getRecipe(APPLE_PIE), 0); // works fine
        // test large number of servings
        // no container cleanings seems suspicious
        // I think you're missing a check on if there are enough containers for total servings
        brewery.createBatch(brewery.library.getRecipe(APPLE_PIE), 10000);

        // Print inventory
        brewery.inventory.printInventory();
    }

    // Create a batch of a recipe for a certain number of servings
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
