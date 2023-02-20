package com.linkedlist;

class Node {
    public int data;
    public Node next;

    public void displayNodeData() {
        System.out.println("{ " + data + " } ");
    }
}public class CreateLinkedList {
    private Node head;

    public boolean isEmpty() {
        return (head == null);
    }

    // used to insert a node at the start of linked list
    public int insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
        return data;
    }

    // For printing Linked List
    public void printLinkedList() {
        System.out.println("Printing LinkedList (head --> last) ");
        Node current = head;
        while (current != null) {
            current.displayNodeData();
            current = current.next;
        }
        System.out.println();
    }
}


