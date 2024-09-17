public class Ingredient {
    String name;
    int quantity;

    public Ingredient(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }


    /*
    * returns a user friendly string
    */
    public String toString(){
        return name + " - " + quantity;
    }

    /*
    * subtracts an amount off a certain quantity f an ingredient
     */
    public boolean subtract(int amount){
        if(amount > quantity){
            return false;
        }
        quantity -= amount;
        return true;
    }

    /*
    * adds the amount to our quantity of an ingredient
     */
    public void add(int amount) {
        quantity += amount;
    }
}
