public class Library {
    List<Recipe> recipeList;
    public Library(){
        recipeList = new List<>();
    }
    public void addRecipe(Recipe recipe){
        recipeList.add(recipe);
    }
    public void removeRecipe(Recipe recipe){
        recipeList.remove(recipe);
    }

    public Recipe getRecipe(String name) {
        for (int i = 0; i < recipeList.size; i++) {
            if (recipeList.get(i).name == name){
                return recipeList.get(i);
            }
        }
        return null;
    }

    public void printRecipeList(){
        for (int i = 0; i < recipeList.size; i++) {
            recipeList.get(i).printRecipe();
            System.out.println();
        }
    }


}
