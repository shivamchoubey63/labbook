package com.cg.iter;
import java.util.Scanner;
public class SumTest {
	static int CalculateSum(int n)
	{
		int sum=0;
		for(int x=1; x<=n;x++) {
			if(x%3==0 || x%5==0) {
				sum=sum+x;
			}
		}
	return sum;
	}

	public static void main(String[] args) {
		int n;
		System.out.println("Enter the value of n");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		System.out.println(CalculateSum(n));

	}

}
