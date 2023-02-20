public interface IList<E> {
    /**
     * pre: 
     * post: el valor es agregado a la cola de la lista
     * @param value
     */
    public void add(E value);
    /**
     * pre: i debe ser mayor a 0 y menor a size()
     * post: retorna el valor en i remueve el valor en el indice i de la lista
     * @param i
     */
    public E remove();
    /**
     * pre: la lista debe tener por lo menos un valor
     * post: retorna el valor de la lista en el indice i
     * @param i
     * @return
     */
    public E get(int i);
    /**
     * pre: 
     * post: retorna true si la lista esta vacia
     * @return true si la lista esta vacia
     */
    public boolean isEmpty();
    /**
     * pre: 
     * post: retorna el numero de elementos de la lista
     * @return
     */
    public int size();

}
