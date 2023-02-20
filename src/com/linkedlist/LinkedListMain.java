package com.linkedlist;

public class LinkedListMain {

    public static void main(String args[]) {
        CreateLinkedList myLinkedlist = new CreateLinkedList();
        System.out.println("Create a linked list using append method: ");
        myLinkedlist.insertFirst(56);
        myLinkedlist.insertFirst(30);
        myLinkedlist.insertFirst(70);


        Node node = new Node();
        node.data = 1;

        myLinkedlist.printLinkedList();
    }
}
