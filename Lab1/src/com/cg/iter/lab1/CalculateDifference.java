package com.cg.iter.lab1;

import java.util.Scanner;

public class CalculateDifference {

	public static int calculateDifference(int n) {

		int a=0, m;
		int c = 0,b=0;
		for(int i=1;i<=n;i++) {
			a = i*i;
			c = c+a;
			b = b+i;
		}
		int d = b*b;
		m = c - d;
		return m;

	}

	public static void main(String s[]) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = scan.nextInt();
		System.out.println(calculateDifference(n));

	}
}