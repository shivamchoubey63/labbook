package com.cg.iter;

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int previousDigit =6
        		;
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