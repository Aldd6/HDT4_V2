public class DoubleList<E> implements IList<E>{
    private DoubleNode<E> beginning;
    private DoubleNode<E> end;

    /*
     * constructor 
     */
    public DoubleList(){
        beginning = null;
        end = null;
    }

    /*
     * IsEmpty
     */
    @Override
    public boolean isEmpty(){
        return beginning == null;
    }

    /*
     * add to end
     */
    public void add(E d){
        if(!isEmpty()){
            end = new DoubleNode<E>(d, null, end);
            end.previous.next=end;
        }
        else{
            beginning = end = new DoubleNode<E>(d);
        }
    }

    @Override
    public E remove(){
        E element = end.data;
        if(beginning == end){
            beginning = end = null;
        }
        else{
            end = end.previous;
            end.next = null;
        }
        return element;
    }

    @Override
    public E get(int i) {
        DoubleNode<E> t = beginning;
        int last = size() - 1;
        for(int j = 0; j < last; j++){
            if(j == last){
                break;
            }
            else{
                t = t.next;
            }
        }

        return t.data;
    }

    @Override
    public int size() {
        
       DoubleNode<E> run = beginning;
       int counter = 0;
       while(run != null){
        counter++;
        run = run.next;
       }
       return counter;
    }

}
