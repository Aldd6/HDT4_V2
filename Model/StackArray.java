import java.util.ArrayList;

public class StackArray<E> extends AbstractStack<E> {

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
    public int size(){
        return array.size();
    }
    
}
