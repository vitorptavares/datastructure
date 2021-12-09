package com.datastructure.stack;

public class StackLinkedList <T> {

    //O último intem inserido será o primeiro a ser removido pelo metodo pop()
    private Node<T> head;

    private int count;

    public boolean isEmpty(){
        return count == 0 ? true : false;
    }

    public int getSize(){
        return this.count;
    }

    public T pop(){
        if(head==null){
            return null;
        }
        Node<T> oldHead = head;
        head = oldHead.getNextNode();
        count--;
        return oldHead.getData();
    }

    //0(1)
    public void push(T data){
        Node<T> newNode = new Node<>(data);
        newNode.setNextNode(head);
        head = newNode;
        count++;
    }
}
