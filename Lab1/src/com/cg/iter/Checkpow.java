package com.cg.iter;

public class Checkpow {
	public Checkpow() {
		for(int i=2; i<1000;i++) {
			if (checkNumber(i))
				System.out.println(i+ "is a power of 2");
		}
	}
	public boolean checkNumber(int number) {
		if(number==1)
			return true;
		if(number%2!=0)
			return false;
		int rem=number/2;
		return checkNumber(rem);
	}

	public static void main(String[] args) {
		new Checkpow();

	}

}
