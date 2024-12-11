/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dsa1;

/**
 *
 * @author dsu10
 */
class BinaryTree {
    BinaryTree root; 

    BinaryTree(int key) {
        root = new BinaryTree(key);
    }

    BinaryTree() {
        root = null;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new BinaryTree(1); 

        tree.root.left = new BinaryTree(2);
        tree.root.right = new BinaryTree(3);

        tree.root.left.left = new BinaryTree(4);
        tree.root.left.right = new BinaryTree(5);

        
        System.out.println("Root node: " + tree.root.key);
        System.out.println("Left child of root: " + tree.root.left.key);
        System.out.println("Right child of root: " + tree.root.right.key);
    }
}

public class BinaryTree {
    int key;
    BinaryTree left;
    Node right;

    public BinaryTree(int item) {
        key = item;
        left = right = null;
    }
}
