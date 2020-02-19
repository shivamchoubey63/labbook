package com.cg.iter;

public class DifferenceLab1Ex2 {
	static int calculateDifference(int n) {
		int a,b,c;
		a=(n*(n+1)*(2*n+1))/6;
		b=(n*(n+1))/2;
		b=b*b;
		 int m = Math.abs(a-b);
		return m;
	}

	public static void main(String[] args) {
		int n=4;
		System.out.println(calculateDifference(n));

	}

}
