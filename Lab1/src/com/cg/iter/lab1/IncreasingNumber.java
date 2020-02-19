package com.cg.iter.lab1;

import java.util.Scanner;

public class IncreasingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scan.nextInt();
        int previousDigit = 9;
        boolean checkNumber = true;
        while (n > 0) {
            int currentDigit = n % 10;
            n = n / 10;
            if (currentDigit > previousDigit) {
            	checkNumber = false;
                break;
            }
            previousDigit = currentDigit;
        }
        System.out.println("Increasing number = " + checkNumber);
    }
}