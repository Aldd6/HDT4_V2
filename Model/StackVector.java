import java.util.Vector;

public class StackVector<E> implements IStack<E> {
    
    private Vector<E> vector = new Vector<>();

    @Override
    public void push(E item){
        vector.add(item);
    }

    @Override
    public E pop(){
        return vector.remove(size()-1);
    }

    @Override
    public E peek(){
        return vector.get(size()-1);
    }

    @Override
    public boolean empty(){
        return vector.isEmpty();
    }

    @Override
    public int size(){
        return vector.size();
    }
}
