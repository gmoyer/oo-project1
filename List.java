public class List<T> {
    //T[] data = new T[2];
    private T[] data;
    public int size = 0;

    public List(){
        data = (T[]) new Object[2];
    }

    public void add(T x){
        data[size++] = x;
        if(size == data.length){
            doubleLen();
        }
    }
    private void doubleLen(){
        T[] newData = (T[]) new Object[data.length * 2];
        for(int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }
    public T get(int i){
        if (i >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[i];
    }

    public int find(T x) {
        for (int i = 0; i < size; i++) {
            if (data[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public boolean remove(T x) {
        int index = find(x);
        // If we do not find the element, return false
        if (index == -1) {
            return false;
        }
        // Remove the found element
        for (int i = index; i < size-1; i++) {
            data[i] = data[i + 1];
        }
        size--;

        return true;
    }
}
