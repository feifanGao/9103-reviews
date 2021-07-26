class LinkedListIterator<T> implements Iterator<T> {
    private Node<T> cursor;
    
    public LinkedListIterator(Node<T> head) { 
        cursor = head;
    }
    public boolean hasNext() {
        return cursor != null; 
    }
    
    public T next() {
        T element = cursor.getValue(); 
        cursor = cursor.getNext();
        return element; 
    }
}
