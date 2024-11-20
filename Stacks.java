package com.mycompany;

 class ClientStack {
    private int[] arr;  
    private int size;   
    private int index; 
    
    public ClientStack(int size) {
        this.size = size;
        arr = new int[size];
        index = -1;  
    }

    
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++index] = element; 
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;  
        } else {
            return arr[index--];  
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }

    public boolean isFull() {
        return index == size - 1;
    }

    public int size() {
        return index + 1; 
    }
}

public class Stacks {  
    public static void main(String[] args) {
        ClientStack stack = new ClientStack(5);  
        
        stack.push(8);
        stack.push(11);
        stack.push(13);
        stack.push(20);
        stack.push(11);

        System.out.println("1. Size of stack after push operations: " + stack.size());

        
        System.out.println("2. Pop elements from stack: ");
        while (!stack.isEmpty()) {
            System.out.printf("%d ", stack.pop());
        }

       
        System.out.println("\n3. Size of stack after pop operations: " + stack.size());
    }
}