package com.linkedlist;
import java.lang.*;

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

    public void insert(int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }


    public Node deleteAfter(Node after) {
        Node temp = head;
        while (temp.next != null && temp.data != after.data) {
            temp = temp.next;
        }
        if (temp.next != null)
            temp.next = temp.next.next;
        return temp.next;
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


