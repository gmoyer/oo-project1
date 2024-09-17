public class Inventory {
    List<Ingredient> ingredientList;
    public Inventory(){
        ingredientList = new List<>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }
    public void printInventory(){
        System.out.println("-- Inventory --");
        for (int i = 0; i < ingredientList.size; i++) {
            System.out.println(ingredientList.get(i));
        }
        System.out.println();
    }
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
    public Ingredient findIngredient(Ingredient ingredient){
        for (int i = 0; i < ingredientList.size; i++) {
            if(ingredientList.get(i).name.equals(ingredient.name)){
                return ingredientList.get(i);
            }
        }
        return null;
    }

    public void restock(){
        System.out.println("Restocking all ingredients by 100");
        for (int i = 0; i < ingredientList.size; i++) {
            ingredientList.get(i).add(100);
        }
    }
}
