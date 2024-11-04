/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01;
import java.util.Scanner ;
/**
 *
 * @author muham
 */
public class NumberOrderChecker {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();

        
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the second number : ");
        int num3 = scanner.nextInt();
    

    if (num1>num2 && num2 > num3){
            System.out.println("Decreasing");
    }
    else if (num1<num2 && num2<num3){
        System.out.println("Increasing");
    }
    else {
        System.out.println("Neither");
    }
  }  
}
