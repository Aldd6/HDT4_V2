public class StackLista<E> implements IStack<E> {

    private Lista<E> lista = new Lista<>();

    public void push(E item){
        lista.add(item);
    }

    public E pop(){
        return lista.remove();
    }

    public E peek(){
        return lista.get(size()-1);
    }

    public boolean empty(){
        return lista.isEmpty();
    }

    public int size(){
        return lista.size();
    }
    
}
