package queue;

public class Queue<T> {
    private Node<T> firstNode;

    private Node<T> lastNode;

    private int count;

    public boolean isEmpty(){
        return this.firstNode == null;
    }

    public int size(){
        return this.count;
    }

    public void enqueue(T newData){
        Node<T> oldLastNode = lastNode;
        lastNode = new Node<>(newData);
        lastNode.setNextNode(null);
        if(isEmpty()){
            firstNode = lastNode;
        }
        else{
            //aqui, a referencia serã armazenada do penultimo no para o ultimo, ou seja, o primeiro no vai conhecer o segundo e assim
            //adiante pois é necessário manter essa referencia no primeiro no para que na hora do desenfileiramento eu consiga atualizar
            //a referencia do proximo no
            oldLastNode.setNextNode(lastNode);
        }
        count++;
    }

    public T dequeue(){
        T t = null;
        if(firstNode!=null){
            t =firstNode.getT();
            Node<T> previusNode = firstNode.getNextNode();
            firstNode = previusNode;
            count--;
        }
        return t;
    }
}
