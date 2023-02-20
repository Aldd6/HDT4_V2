

public class StackFactory<E>{
    
    public IStack<E> getStack(int op){
        if(op == 1){
            return new StackArray<>();
        }
        else if(op == 2){
            return new StackVector<>();
        }
        else if(op == 3){
            return new StackLista<>();
        }
        else if(op == 4){
            return new StackDoubleList<>();
        }
        else{
            return null;
        }
    }
}
