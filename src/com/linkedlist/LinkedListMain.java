package com.linkedlist;

public class LinkedListMain {

    public static void main(String args[]) {
        CreateLinkedList myLinkedlist = new CreateLinkedList();

        myLinkedlist.insert(56);
        myLinkedlist.insert(30);
        myLinkedlist.insert(70);
        System.out.println("After deleting last element: ");
      //  System.out.println(myLinkedlist.deleteFirst());
        myLinkedlist.deleteAfter(Node 3);

        Node node = new Node();
        node.data = 1;
        myLinkedlist.deleteAfter(node);

        myLinkedlist.printLinkedList();
    }
}
