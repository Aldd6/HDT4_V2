import java.util.EmptyStackException;

public interface IStack<E> {
    /**
     * pre:
     * post: el stack agrega un nuevo elemento
     * @param item
     */
    public void push(E item);
    /**
     * pre: el stack no esta vacio
     * post: el elmento más reciente es retirado
     * @return el valor del elemento más reciente en el stack
     * @throws EmptyStackException
     */
    public E pop() throws EmptyStackException;
    /**
     * pre: el stack no esta vacio
     * post: retorna el valor más alto es retornado
     * @return el valor más alto en el stack
     * @throws EmptyStackException
     */
    public E peek() throws EmptyStackException;
    /**
     * pre: 
     * post: retorna true si y solo si esta vació
     * @return retorna true si esta vacio y false si tiene elementos
     */
    public boolean empty();
    /**
     * pre: 
     * post: retorna el numero de elmentos en el stack
     * @return numero de elemenos en el stack
     */
    public int size();
}
