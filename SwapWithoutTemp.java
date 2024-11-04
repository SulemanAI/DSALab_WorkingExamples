/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab_01;
import java.util.Scanner ;
/**
 *
 * @author muham
 */
public class SwapWithoutTemp {

    public static void main(String[] args) {
//        int num1 , num2 ;
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter the first number : ");
        int num1 = scanner.nextInt();

        
        System.out.print("Enter the second number : ");
        int num2 = scanner.nextInt();

        
        System.out.println("The value of numbers before swaping is a = "+num1+" and b = "+num2);

        scanner.close();
    
        num1 = num1 ^ num2;
        num2 = num2 ^ num1;
        num1 = num1 ^ num2;
        
        System.out.println("The value of numbers after swaping is a = "+num1+" and b = "+num2);

    }
}
