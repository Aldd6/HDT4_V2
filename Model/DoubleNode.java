public class DoubleNode<E> {
    
    public E data;
    DoubleNode<E> next;
    DoubleNode<E> previous;

    /*
     * No existing nodes
     */
    public DoubleNode(E d){
        this(d, null, null);
    }

    /*
     * Constructor for existing nodes
     */
    public DoubleNode(E d, DoubleNode<E> n, DoubleNode<E> p){
        data = d;
        next = n;
        previous = p;

    }
    
}


