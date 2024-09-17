public class Library {
    List<Recipe> recipeList;
    public Library(){
        recipeList = new List<>();
    }
    //add Recipe object to Library List
    public void addRecipe(Recipe recipe){
        recipeList.add(recipe);
    }
    //removes Recipe object from Library List
    public void removeRecipe(Recipe recipe){
        recipeList.remove(recipe);
    }
    //get Recipe from string name parameter
    public Recipe getRecipe(String name) {
        for (int i = 0; i < recipeList.size; i++) {
            if (recipeList.get(i).name.equals(name)) {
                return recipeList.get(i);
            }
        }
        return null;
    }
    //prints Library list
    public void printRecipeList(){
        for (int i = 0; i < recipeList.size; i++) {
            recipeList.get(i).printRecipe();
            System.out.println();
        }
    }


}
