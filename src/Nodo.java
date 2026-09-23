public class Nodo <T>{

    private T data;
    private Nodo next;

    // metodo constructor
    public Nodo (T data){
        this.data = data;
        this.next = null;
    }

    // metodo constructor sobreescrito
    public Nodo (){
        this.data = null;
        this.next = null;
    }

    //getters y setters
    public T getData(){
        return this.data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Nodo getNext(){
        return this.next;
    }

    public void setNext(Nodo next){
        this.next = next;
    }
}
