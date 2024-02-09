/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.q1.checkifevenorodd;

import java.util.Scanner;
/**
 *
 * @author Academy-User
 */
public class Q1CheckIfEvenOrOdd {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a number:");
      int num = scan.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + "is an even number.");
        } else {
            System.out.println( num +" is an odd number");
        }
        
    }
}
