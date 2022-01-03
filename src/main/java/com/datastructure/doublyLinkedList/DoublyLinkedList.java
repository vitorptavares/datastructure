package doublyLinkedList;

import linkedlist.List;

public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> heap;
    private Node<T> last;
    private int numberOfItems;

    public void insertBeginning(T data){
        Node<T> newNode =  new Node(data);
        if(heap==null)
            heap = newNode;
       else{
            insertBeginning(newNode);
        }
       numberOfItems++;
    }

    private void insertBeginning(Node<T> newNode) {
        newNode.setNextNode(heap);
        heap.setPreviusNode(newNode);
        heap = newNode;
    }

    public void insertEnd(T data){
        Node newNode = new Node(data);
        if(last==null){
            last = newNode;
        }
        else {
            insertEnd(newNode);
        }
    }

    private void insertEnd(Node newNode) {
        newNode.setPreviusNode(last);
        last.setNextNode(newNode);
        last = newNode;
    }


    public void remove(T data) {

    }

    public int size() {
        return numberOfItems;
    }

    public void transversefromBeginning() {
        Node actualNode = heap;
        while (actualNode!=null){
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }

    public void transversefromEnd() {
        Node actualNode = last;
        while (actualNode!=null){
            System.out.println(actualNode);
            actualNode = actualNode.getPreviusNode();
        }
    }

    public Node<T> getHeap() {
        return heap;
    }

    public void setHeap(Node<T> heap) {
        this.heap = heap;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
}
