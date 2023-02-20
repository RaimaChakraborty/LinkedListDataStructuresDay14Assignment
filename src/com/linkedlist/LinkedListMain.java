package com.linkedlist;

public class LinkedListMain {

    public static void main(String args[]) {
        CreateLinkedList myLinkedlist = new CreateLinkedList();
        System.out.println("Create a linked list using append method: ");
        myLinkedlist.insertLast(56);
        myLinkedlist.insertLast(30);
        myLinkedlist.insertLast(70);


        Node node = new Node();
        node.data = 1;

        myLinkedlist.printLinkedList();
    }
}
