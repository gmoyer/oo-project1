public class Brewery {
    public static void main(String args[]){
        System.out.println("hello world");
        List<Integer> l1 = new List<Integer>();
        l1.add(4);
        l1.add(5);
        l1.add(7);
        l1.add(9);
        l1.add(10);
        l1.remove(7);
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));
        System.out.println(l1.get(2));
        System.out.println(l1.get(3));
        System.out.println(l1.get(4));

    }
}
