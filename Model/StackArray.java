import java.util.ArrayList;

public class StackArray<E> implements IStack<E> {

    private ArrayList<E> array = new ArrayList<>();

    @Override
    public void push(E item){
        array.add(item);
    }

    @Override
    public E pop(){
        return array.remove(size()-1);
    }

    @Override
    public E peek(){
        return array.get(size()-1);
    }

    @Override
    public boolean empty(){
        return array.isEmpty();
    }

    @Override
    public int size(){
        return array.size();
    }
    
}
