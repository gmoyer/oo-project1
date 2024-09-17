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

    public boolean subtract(int amount){
        if(amount > quantity){
            return false;
        }
        quantity -= amount;
        return true;
    }

    public void add(int amount) {
        quantity += amount;
    }
}
