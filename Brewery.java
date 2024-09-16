public class Brewery {

    Inventory inventory;

    public Brewery(){
        inventory = new Inventory();
    }

    public static void main(String args[]){
        ContainerManager cm = new ContainerManager(3);

        Container c1 = cm.getCleanContainer();
        System.out.println(c1);
        System.out.println(c1.dirty);
        c1.use();
        System.out.println(c1.dirty);

        Container c2 = cm.getCleanContainer();
        System.out.println(c2.dirty);
        c2.use();

        Container c3 = cm.getCleanContainer();
        System.out.println(c3.dirty);
        c3.use();

        cm.getCleanContainer();


    }

    public void createBatch(Recipe recipe, int servings){
        List<Ingredient> ingredients = recipe.getIngredients(servings);
        for(int i = 0; i < ingredients.size; i++){
            inventory.remove(ingredients.get(i));
        }
    }
}
