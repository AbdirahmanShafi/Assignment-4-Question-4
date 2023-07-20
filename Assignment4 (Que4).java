/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment4;

import java.util.Scanner;

/**
 *
 * @author abdir
 */
public class Assignment4Q4 {
      public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();
            
            int max;
            
            // Using switch case to find the maximum number
            switch (num1 > num2 ? 1 : (num1 == num2 ? 0 : -1)) {
                case 1:
                    max = num1;
                    break;
                case 0:
                    max = num1; // or num2, as both are equal
                    break;
                case -1:
                    max = num2;
                    break;
                default:
                    System.out.println("Invalid comparison.");
                    return;
            }
            
            System.out.println("The maximum number is: " + max);
        }
    }
}

