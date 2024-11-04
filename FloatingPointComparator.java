/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab_01;

import java.util.Scanner;

/**
 *
 * @author muham
 */
public class FloatingPointComparator {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter the first number : ");
        float num1 = scanner.nextFloat();

        
        System.out.print("Enter the second number : ");
        float num2 = scanner.nextFloat();
        
        if ((int)(num1 * 1000) == (int)(num2 * 1000)) {
           System.out.println("The numbers are the same up to three decimal places.");
    } else {
            System.out.println("The numbers are different.");
    }

    }
}
