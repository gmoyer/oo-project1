public class Container {
    boolean dirty = false;
    String product;
    int size;
    ContainerManager container = new ContainerManager();

    /*
    * Clean the dirty containers
    * Make sure we have enough containers clean for the amount of product
    */
    public void clean(){
        if(dirty){
            //clean the container

        }
        if(container.hasCleanContainer()){
            if(container.containers.size >= size){
                //we can use them for a new batch!
            }
        }

        }

    }



}
