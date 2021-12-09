package doublyLinkedList;

public class Node<T extends Comparable<T>> {

    private Node<T> previusNode;
    private Node<T> nextNode;
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public Node(Node<T> previusNode, Node<T> nextNode, T data) {
        this.previusNode = previusNode;
        this.nextNode = nextNode;
        this.data = data;
    }

    public Node<T> getPreviusNode() {
        return previusNode;
    }

    public void setPreviusNode(Node<T> previusNode) {
        this.previusNode = previusNode;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
