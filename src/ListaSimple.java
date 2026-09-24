public class ListaSimple <T> {

    private Nodo head;
    private Nodo tail;
    private int size;

    public ListaSimple() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    //metodos de la lista
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public Nodo First() {
        return this.head;
    }

    public Nodo Last() {
        return this.tail;
    }

    public void addFirst(T data) {
        Nodo<T> n = new Nodo<>(data);
        if (this.isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            n.setNext(this.head);
            this.head = n;
        }
        this.size += 1;
    }

    public void addLast(T data) {
        Nodo<T> n = new Nodo<>(data);
        if (this.isEmpty()) {
            this.head = n;
            this.tail = n;
        } else {
            this.tail.setNext(n);
            this.tail = n;
        }
        this.size += 1;
    }

    public T removeFirst() {
        if (this.isEmpty()) {
            return null;
        } else {
            Nodo<T> temp = this.head;
            this.head = this.head.getNext();
            temp.setNext(null);
            this.size -= 1;

            return temp.getData();
        }
    }

    public T removeLast() {
        if (this.size < 1) {
            return null;

        } else if (this.size == 1) {
            return this.removeFirst();

        } else {
            Nodo<T> temp = this.tail;
            Nodo<T> anterior = this.head;

            while (anterior.getNext() != this.tail) {
                anterior = anterior.getNext();
            }

            anterior.setNext(null);
            this.tail = anterior;
            this.size -= 1;

            return temp.getData();
        }
    }
}