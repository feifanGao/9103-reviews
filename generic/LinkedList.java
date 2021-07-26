class Node<T>{
    public T element; 
    public Node<T> next;
    public Node(T element){ 
        this.element = element; next = null;
    } 
}

public class LinkedList<T>{ 
    Node<T> root;
    public LinkedList(){
    root = null; }
    public void add(T element){
        Node<T> newNode = new Node<T>(element); 
        if(root == null)
            root = newNode; 
        else{
            Node<T> cursor = root; 
            while(cursor.next != null)
                cursor = cursor.next; cursor.next = newNode;
        } 
    }
    public int size(){
        int size = 0;
        Node<T> curr = root;
        while(curr!=null){
            size++;
            curr = curr.next;
        }
        return size;
    } 
}
