package com.nitin;

import java.io.ObjectInputStream.GetField;

public class RecursionLoop {
	static Integer[] intarry = { 1, 1, 3, 5, 8 };

	public static void main(String args[]) {

		System.out.println("factorial" + factorial(5));
		System.out.println("fibnnace " + fibo(5));

	}

	private static int fibo(Integer i) {
		// TODO Auto-generated method stub
		if (i == 0) {
			return 0;
		} else if (i == 1) {
			return 1;
		}
        
		return fibo(i - 1) + fibo(i - 2);
	}

	private static int factorial(int i) {
		if (i == 0)
			return 1;

		return i * factorial(i - 1);
	}
}
