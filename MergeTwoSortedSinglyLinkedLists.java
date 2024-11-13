/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment_02;

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
    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
public class MergeTwoSortedSinglyLinkedLists {
    public static SinglyLinkedList mergeSortedLists(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node dummy = new Node(0);
        Node tail = dummy;
        Node ptr1 = list1.head, ptr2 = list2.head;

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data <= ptr2.data) {
                tail.next = ptr1;
                ptr1 = ptr1.next;
            } else {
                tail.next = ptr2;
                ptr2 = ptr2.next;
            }
            tail = tail.next;
        }

        if (ptr1 != null) tail.next = ptr1;
        if (ptr2 != null) tail.next = ptr2;

        mergedList.head = dummy.next;
        return mergedList;
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.append(1);
        list1.append(3);
        list1.append(5);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.append(2);
        list2.append(4);
        list2.append(6);

        SinglyLinkedList mergedList = mergeSortedLists(list1, list2);
        System.out.print("Merged list: ");
        mergedList.printList();
    }
}
