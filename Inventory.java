public class Inventory {
    List<Ingredient> ingredientList;
    public Inventory(){
        ingredientList = new List<>();
    }

    public void addIngredient(Ingredient ingredient){
        ingredientList.add(ingredient);
    }
    public void printInventory(){
        for (int i = 0; i < ingredientList.size; i++) {
            System.out.println(ingredientList.get(i));
        }
    }
    public void remove(Ingredient ingredient){
        //Removes ingredient from ingredientList
        ingredientList.remove(ingredient);
    }
    public void addToThreshold(Ingredient ingredient, int amount){
        //Adds amount to ingredient quantity
        ingredient.add(amount);
    }

    public void subToThreshold(Ingredient ingredient, int amount){
        //subtracts amount from ingredient quantity and removes ingredient if amount exceeds quantity
        if(ingredient.split(amount)==null){
            remove(ingredient);
            System.out.println("Ingredient ran out!");
        }else {
            ingredient.split(amount);
        }
    }
    public void findIngredient(Ingredient ingredient){
        for (int i = 0; i < ingredientList.size; i++) {
            if(ingredientList.get(i) == ingredient){
                System.out.println("Ingredient found: "+ ingredient);

            }
            System.out.println("Ingredient not found!");
        }
    }
}
