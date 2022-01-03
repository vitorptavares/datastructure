package com.datastructure.linkedlist;

public class LinkedList<T extends Comparable<T>> implements List<T> {
   private Node<T> rootNode;
   private int numbOfItems;


    @Override
    public void insert(T data) {
        if(rootNode==null){
            //Entao esse é o primeiro elemento a ser adicionado na lista
            rootNode = new Node<>(data);
        }
        else{
            insertAtBeginning(data);
        }
        numbOfItems++;
    }
    //Precisamos atualizar as referencias 0(1)
    private void insertAtBeginning(T data) {
        Node newNode = new Node(data);
        newNode.setNextNode(rootNode);
        rootNode = newNode;
    }

    @Override
    public void remove(T data) {
        if(rootNode==null)
            return;
        //Caso o node a ser removido seja o primeiro
        if(rootNode.getData().compareTo(data)==0){
            removeRootNode();
        }
        removeNode(data, rootNode);
    }

    private void removeNode(T data, Node<T> node) {
        while (node.getNextNode()!=null){
            if(node.getNextNode().getData().compareTo(data)==0){
                node.setNextNode(node.getNextNode().getNextNode());
                return;
            }
            node= node.getNextNode();
        }
        numbOfItems--;
    }

    private void removeRootNode() {
        if(rootNode.getNextNode()!=null){
            rootNode = rootNode.getNextNode();
        }else {
            rootNode = null;
        }
        numbOfItems--;
        return;
    }

    @Override
    public int size() {
        return numbOfItems;
    }

    @Override
    public void transverse() {
        if(rootNode==null)
            return;
        Node actualNode = rootNode;
        while (actualNode!=null){
            System.out.println(actualNode);
            actualNode = actualNode.getNextNode();
        }
    }
}
