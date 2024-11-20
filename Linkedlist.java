package com.mycompany.mavenproject1;

public class LinkedList { // Rename this class to LinkedList
    private Node front;
    private Node rear;

    static class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public void insertLast(int new_data) {  // Insert at end of queue
        Node new_node = new Node(new_data);
        if (isEmpty()) {  // If empty queue
            front = new_node;  // Front --> new_node
        } else {
            rear.next = new_node;  // Old rear --> new_node
        }
        rear = new_node;  // New_node <-- rear
    }

    public void insertFirst(int new_data) {  // Insert at start of queue
        Node new_node = new Node(new_data);
        if (isEmpty()) {  // If empty list
            front = new_node;  // First --> new_node
        } else {
            new_node.next = front;  // New_node -> next --> front
        }
        front = new_node;  // Front <-- new_node
    }

    public int deleteFirst() {
        int temp = front.data;
        if (front.next == null) {  // If only one element
            rear = null;
        }
        front = front.next;
        return temp;
    }

    public int deleteLast() {
        int temp = rear.data;
        Node current = front;

        while (current.next != rear) {  // Traverse to second last node
            current = current.next;
        }
        current.next = null;
        rear = current;
        return temp;
    }

    void displayList() {
        System.out.println("==== Displaying Elements of DEQ ====");
        Node current = front;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}

class DoubleEndedQueue {
    LinkedList llist;  // Updated to use LinkedList

    public DoubleEndedQueue() {
        llist = new LinkedList();  // Updated to use LinkedList
    }

    public boolean isEmpty() {
        return llist.isEmpty();
    }

    public void enqueueAtRear(int new_data) {
        llist.insertLast(new_data);
    }

    public void enqueueAtFront(int new_data) {
        llist.insertFirst(new_data);
    }

    public int dequeueFromFront() {
        return llist.deleteFirst();
    }

    public int dequeueFromRear() {
        return llist.deleteLast();
    }

    void printQueue() {
        llist.displayList();
    }
}

public class Linkedlist { // Main class should remain Linkedlist
    public static void main(String[] args) {
        DoubleEndedQueue deq = new DoubleEndedQueue();
        deq.enqueueAtRear(12);
        deq.enqueueAtRear(13);
        deq.enqueueAtRear(18);
        deq.printQueue();
        deq.enqueueAtFront(30);
        deq.printQueue();
        int element1 = deq.dequeueFromFront();
        System.out.println("Dequeued element (from front) is " + element1);
        deq.printQueue();
        int element2 = deq.dequeueFromRear();
        System.out.println("Dequeued element (from rear) is " + element2);
        deq.printQueue();
    }
}
