public class w7_linkedlist<T>{
    private w7_node<T> head;
    private int size;

    public w7_linkedlist(){
        head = null;
        size = 0;
    }

    public void add(T v){
        if(head == null){
            head = new w7_node<T>(v); 
        }else{
            w7_node<T> curr = head;
            while(curr.getNext()!=null)
                curr = curr.getNext();
            curr.setNext(new w7_node<T>(v));
        }
        size++;
    }

    public void printlist(){
        w7_node<T> curr = head;
        while(curr.getNext()!=null){
            System.out.println(curr.getValue());
            curr = curr.getNext();
        }
        System.out.println(curr.getValue());   
    }

    public int size(){
        return size;
    }
    public static void main(String[] args){
        w7_linkedlist<String> c = new w7_linkedlist<String>();
        c.add("head");
        c.add("tail");
        
        c.printlist();  

    }
}
