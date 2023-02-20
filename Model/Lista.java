public class Lista<E> implements IList<E> {
    protected Nodo<E> cabeza, cola;

    public Lista(){
        cabeza = null;
        cola = null;
    }

    @Override
    public E get(int i){
        Nodo<E> temporal = cabeza;
        int ultimo_nodo = size()-1;
        for(int j = 0; j<ultimo_nodo; j++){
            if(j == ultimo_nodo){
                break;
            }
            else{
                temporal = temporal.siguiente;
            }
        }
        return temporal.dato;
    }

    @Override
    public boolean isEmpty(){
        if(cabeza == null){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public void add(E value){
        if(!isEmpty()){
            cola.siguiente = new Nodo<E>(value);
            cola = cola.siguiente;
        }
        else{
            cabeza = cola = new Nodo<E>(value);
        }
    }

    @Override
    public E remove(){
        E elemento = cola.dato;
        if(cabeza == cola){
            cabeza = cola = null;
        }
        else{
            Nodo<E> temporal = cabeza;
            while(temporal.siguiente != cola){
                temporal = temporal.siguiente;
            }
            cola = temporal;
            cola.siguiente = null;
        }
        return elemento;
    }

    @Override
    public int size(){
        Nodo<E> recorrer = cabeza;
        int contador = 0;
        while(recorrer != null){
            contador++;
            recorrer = recorrer.siguiente;
        }
        return contador;
    }
}
