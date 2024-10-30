/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dsa_lab;

/**
 *
 * @author 123
 */

class Main{
    // Search Operation
    static int findElement(int arr[],int n,int key){
        for(int i=0;i<n;i++)
            if(arr[i] == key)
                return i;
        // if the key is not found!
        return -1;
   
    }
}


public class SearchingInUnsortedArray {
    // Driver's Code

    public static void main(String[] args) {

    
   int  arr[] = {25,63,24,12,67};
   int n = arr.length;
   
   // Using a last element as search element
   int key = 67;
   
   // Function Call
   int position = Main.findElement(arr,n,key);
   
   if (position == -1)
            System.out.println("Element not found");
    else
            System.out.println("Element found at Position: " +(position+1));

    }
}




