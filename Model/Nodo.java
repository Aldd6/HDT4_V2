public class Nodo<E> {
    public E dato;
    public Nodo<E> siguiente;

    /**
     * Metodo para incertar al final nodos
     * @param dato
     */
    public Nodo(E dato){
        this.dato = dato;
        this.siguiente = null;
    }

    /**
     * Metodo para incertar al inicio nodos.
     * @param dato
     * @param siguiente
     */
    public Nodo(E dato, Nodo<E> siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
