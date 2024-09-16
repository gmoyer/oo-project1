import java.util.Locale;

public class Inventory {
    List<String> stock = new List<>();//tracks item names
    List<Integer> stockThreshold = new List<>();//tracks the items threshold based on index


    public void addToInventory(String name, int amount){
        //Converts parameter name to lowercase and adds to list stock, parameter amount is added to stockThreshold
        String newItem = name.toLowerCase();
        stock.add(newItem);
        stockThreshold.add(amount);
    }
    public void removeInventory(String name){
        //Removes name from stock list and amount
        String newItem = name.toLowerCase();
        int newItemIndex = findItem(name);
        int threshold = stockThreshold.get(newItemIndex);
        stock.remove(newItem);
        stockThreshold.remove(threshold);
    }
    public void addToThreshold(String name, int amount){
        //for stock variable name, add amount to previous threshold
        String newItem = name.toLowerCase();
        int newItemIndex = findItem(newItem);
        int threshold = stockThreshold.get(newItemIndex);
        stockThreshold.set(threshold+amount,newItemIndex);
    }
    public void subToThreshold(String name, int amount){
        //for stock variable name, subtract amount to previous threshold
        String newItem = name.toLowerCase();
        int newItemIndex = findItem(name);
        int threshold = stockThreshold.get(newItemIndex);
        stockThreshold.set(threshold-amount,newItemIndex);
        if(stockThreshold.get(newItemIndex)<0){
            removeInventory(newItem);
        }
    }
    public String getInventory(int i){
        //returns the index variable for both stock and stockThreshold lists - output:pinapple3
        return stock.get(i) + stockThreshold.get(i);
    }
    public int findItem(String name){
        //finds the item in the stock list
        return stock.find(name);
    }

}
