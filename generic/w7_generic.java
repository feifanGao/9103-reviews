public class w7_generic<T> {
    private T element;
    public w7_generic(T element) { 
        this.element = element;
    }
    public T set(T element) {
        T oldElement = this.element; 
        this.element = element; 
        return oldElement;
    }
    public T get() { 
        return element;
    }

    public static void main(String[] args){
        w7_generic<String> c = new w7_generic<String>("hello");
        String s1 = c.get();
        c.set("new");
        String s2 = c.get();
        System.out.println(s1);  
        System.out.println(s2);  

        w7_generic<Integer> b = new w7_generic<Integer>(1);
        int s3 = b.get();
        b.set(10);
        int s4 = b.get();
        System.out.println(s3);  
        System.out.println(s4); 
    }
}
