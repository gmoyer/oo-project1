import java.util.ArrayList;

public class ContainerManager {
/*
* Keep track of our clean containers
*
 */
    List<Container> containers;


    public ContainerManager(int count) {
        containers = new List<Container>();
        for(int i = 0; i < count; i++) {
            containers.add(new Container());
        }
    }

    /*
    * get a clean container from our containers list.
    * return the container we grapped

     */
    public Container getCleanContainer(){
        for(int i = 0; i < containers.size; i++){
            if(!containers.get(i).dirty){
                return containers.get(i);
            }
        }
        System.out.println("No clean containers, cleaning containers now!");
        cleanDirtyContainers();
        return containers.get(0);
    }

    /*
    * Take your dirty containers and clan them
    * Then, add the container to the containers list
    */
    public void cleanDirtyContainers(){
        for(int i = 0; i < containers.size; i++){
            if(containers.get(i).dirty){
                containers.get(i).clean();
            }

        }

    }



}
