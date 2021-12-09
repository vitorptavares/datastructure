package com.datastructure.linkedlist;

//Node é generic para poder ser qualquer tipo de dado
//Node precisa ser type extends Comparable porque será preciso iterar e comparar os nodes
public class Node <T extends Comparable<T>>{

    private T data;

    //Por causa dessa referencia que LinkedList Consome mais memoria do que ArrayList
    private Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return
                "data=" + data;
    }
}
