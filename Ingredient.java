public class Ingredient {
    String name;
    int quantity;

    public Ingredient(String name, int quantity){
        this.name = name;
        this.quantity = quantity;
    }

    public String toString(){
        return name + " - " + quantity;
    }

    public Ingredient split(int amount){
        if(amount > quantity){
            return null;
        }
        quantity -= amount;
        return new Ingredient(name, amount);
    }

    public void add(int amount) {
        quantity += amount;
    }
}
