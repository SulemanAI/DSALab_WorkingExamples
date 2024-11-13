/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author muham
 */


 class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

 class SinglyLinkedList {
    public Node head;

    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
}

public class PrintMiddleNodeOfSinglyLinkedList {
    public static void printMiddleNode(SinglyLinkedList list) {
        if (list.head == null) {
            System.out.println("List is empty");
            return;
        }
        Node slow = list.head, fast = list.head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("Middle node: " + slow.data);
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);
        printMiddleNode(list);
    }
}


