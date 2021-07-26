public class w7_node<T> {
    private T value;
    private w7_node<T> next;

    public w7_node(T v){
        value = v;
        next = null;
    }
    public w7_node<T> getNext() { 
        return next;
    }
    public void setNext(w7_node<T> n) { 
        next = n;
    }
    public T getValue() { 
        return value;
    }
    public void setValue(T v) { 
        value = v;
    } 
}
