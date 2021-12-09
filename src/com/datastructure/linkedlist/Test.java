package com.datastructure.linkedlist;

public class Test {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        linkedList.insert("Vitor");
        linkedList.insert("Priscila");
        linkedList.insert("Levi");

        linkedList.transverse();

        linkedList.remove("Priscila");

        System.out.println("...");
        linkedList.transverse();

    }
}
