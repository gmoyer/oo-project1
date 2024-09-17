public class Inventory {
    List<Ingredient> ingredientList;
    public Inventory(){
        ingredientList = new List<>();
    }

    // Add a new ingredient to the inventory
    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }

    // Print the inventory to the console
    public void printInventory(){
        System.out.println("-- Inventory --");
        for (int i = 0; i < ingredientList.size; i++) {
            System.out.println(ingredientList.get(i));
        }
        System.out.println();
    }

    // Remove a quantity of an ingredient from the inventory
    public void remove(Ingredient ingredient){
        Ingredient stored = findIngredient(ingredient);
        if (stored != null) {
            boolean result = stored.subtract(ingredient.quantity);
            if (!result) {
                System.out.println("Not enough " + ingredient.name + " in inventory");
                restock();
                remove(ingredient);
            }
        } else {
            System.out.println("Ingredient not found in inventory");
        }
    }

    // Find an ingredient in the inventory
    public Ingredient findIngredient(Ingredient ingredient){
        for (int i = 0; i < ingredientList.size; i++) {
            if(ingredientList.get(i).name.equals(ingredient.name)){
                return ingredientList.get(i);
            }
        }
        return null;
    }

    // Add 100 to the quantity of all ingredients in the inventory
    public void restock(){
        System.out.println("Restocking all ingredients by 100");
        for (int i = 0; i < ingredientList.size; i++) {
            ingredientList.get(i).add(100);
        }
    }
}
