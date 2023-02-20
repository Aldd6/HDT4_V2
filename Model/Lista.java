public class Lista<E> extends AbstractList<E> {
    protected Nodo<E> beginnig, end;

    public Lista(){
        beginnig = null;
        end = null;
    }

    @Override
    public E get(int i){
        Nodo<E> temporal = beginnig;
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
    public void add(E value){
        if(!isEmpty()){
            end.siguiente = new Nodo<E>(value);
            end = end.siguiente;
        }
        else{
            beginnig = end = new Nodo<E>(value);
        }
    }

    @Override
    public E remove(){
        E elemento = end.dato;
        if(beginnig == end){
            beginnig = end = null;
        }
        else{
            Nodo<E> temporal = beginnig;
            while(temporal.siguiente != end){
                temporal = temporal.siguiente;
            }
            end = temporal;
            end.siguiente = null;
        }
        return elemento;
    }

    @Override
    public int size(){
        Nodo<E> recorrer = beginnig;
        int contador = 0;
        while(recorrer != null){
            contador++;
            recorrer = recorrer.siguiente;
        }
        return contador;
    }
}
