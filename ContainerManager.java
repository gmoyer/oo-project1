public class ContainerManager {
/*
* Keep track of our clean containers
*
 */
    List<Container> containers;


    /*
    * get a clean container from our containers list.
    * return the container we grapped

     */
    public Container getCleanContainer(){



    }

    /*
    * Check to see if we have clean containers to be used.
    * return true if we do, false if not
    */
    public boolean hasCleanContainer(){
        if(containers.size > 0){
            return true;
        }
        else{
            return false;
        }

    }

    /*
    * Take your dirty containers and clan them
    * Then, add the container to the containers list
    */
    public void cleanDirtyContainers(){


    }



}
