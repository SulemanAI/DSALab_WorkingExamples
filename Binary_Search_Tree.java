/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsa_lab;

/**
 *
 * @author dsu-2
 */
  class Node{
      int key;
      Node left , right;
      
      public Node(int item){
          key = item ;
          left = right = null ;
      }
  }

public class Binary_Search_Tree {

    
      Node root;
      Binary_Search_Tree(int key){
          root = new Node(key);
      }
  
      Binary_Search_Tree(){
          root = null;
      }
      void printPostorder(Node node){
          if (node == null) 
            return ;
          
          printPostorder(node.left);
          
          printPostorder(node.right);
         
          System.out.println(node.key + " ");  
          
      }
      
      void printInorder(Node node){
          if (node == null)
              return ;
          
          printInorder(node.left);
          System.out.println(node.key + " ");
          printInorder(node.right);
          
      }
      
     void printPreorder(Node node){
          if (node == null)
              return ;
          System.out.println(node.key + " ");
             
          printPreorder(node.left);
  
          printPreorder(node.right);
          
      }
     
     
     // Searching a key
     public Node search(Node root , int key){
        if (root==null || root.key == key)
            return root;
        
        if (root.key > key)
            return search(root.left , key); 
     
        return search (root.right , key);
     }
     
     
     // Insertion of a key
     Node insertRec(Node root , int key){
         if (root==null){
             root = new Node(key);
             return root;
         }
         
         else {
                if (key < root.key)
                    root.left = insertRec(root.left , key);
                else if (key > root.key)
                    root.right = insertRec(root.right , key);
               }         
         return root;
     }
     
     //Node Deletion
     Node deleteRec(Node root , int key){
         if (root==null) return root;
         
         if(key < root.key)
             root.left = deleteRec(root.left ,key);
         
         else if(key > root.key)    
             root.right = deleteRec(root.right, key);
         
         else{
             if(root.left == null)
                 return root.right;
             else if(root.right == null)
                 return root.left ;
             
             root.key = minValue(root.right);
             root.right = deleteRec(root.right , root.key);
         }
        
         return root;
     }
     
     int minValue(Node root){
         int minv = root.key;
         while(root.left != null){
             minv = root.left.key;
             root = root.left;
         }
         return minv;
     }
   
    public static void main(String[] args) {
        Binary_Search_Tree tree = new Binary_Search_Tree();
        
        tree.root = new Node(8);
        
        Node a = new Node(3);
        tree.root.left = a;
        Node b = new Node(10);
        tree.root.left = b;
        
        a.left = new Node(1);
        a.right = new Node(6);
        
        b.left = new Node(9);
        b.right = new Node(14);
        
        System.out.println("Pre-Order");
        tree.printPreorder(tree.root);
        
        System.out.println("\nPost-Order");
        tree.printPostorder(tree.root);
        
        System.out.println("\nIn-Order");
        tree.printInorder(tree.root);
    }
}
