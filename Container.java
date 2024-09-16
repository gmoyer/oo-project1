public class Container {
    boolean dirty = false;
    String product;
    int size;


    /*
    * Clean the dirty containers
    * Make sure we have enough containers clean for the amount of product
    */
    public void clean() {
        if (dirty) {
            //clean the container
            System.out.println("Container Cleaned!");
            dirty = false;

        }
        else {
            System.out.println("This container is already clean!");
        }

    }

    public void use(){
        if(!dirty){
            System.out.println("Using this container!");
            dirty = true;
        }
        else{
            System.out.println("This container is already dirty!");
        }
    }
}

