package queue;


public class Node<T> {

    private T t;

    private Node<T> nextNode;

    public Node(T data){
        t = data;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "Node{" +
                "t=" + t +
                ", nextNode=" + nextNode +
                '}';
    }
}
