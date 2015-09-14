package com.nitin;

public class Test {

	static Integer a = 1;
	static int b = 2;
	static String c = "nitin";

	public static void main(String args[]) {

		modify(a, b, c); // by passing params to func();
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);

		modify();// using class variable
		System.out.println("a " + a);
		System.out.println("b " + b);
		System.out.println("c " + c);

	}

	private static void modify() {
		a++;
		b++;
		c = "sachin";

	}

	private static void modify(Integer a, int b, String c) {
		a++;
		b++;
		c = "sachin";
	}
}
