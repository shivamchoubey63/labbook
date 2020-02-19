package com.cg.iter.lab1;

import java.util.Scanner;

class PowerOfTwo {

	public static boolean checkNumber(int n) {
		if (n == 0)
			return false;

		while (n != 1) {
			if (n % 2 != 0)
				return false;
			n = n / 2;
		}
		return true;
	}

	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number:");
		int a = scan.nextInt();
		if (checkNumber(a))
			System.out.println("Yes, It is a Power of 2.");
		else
			System.out.println("No, It is Not a Power of 2.");

	}
}
