package com.nitin.casting;

/**
 * @author nitin
 *
 */
public class TestingCasting {

	static byte b=127;
	static short s=250;
	static int i=567;
	static long l=343;
	
	
	
	
	/*
	 * notice that
	 */
	public static void go(Integer x){
		System.out.println("" +x);
	}
	
	public static void main(String[] args) {

		byte  shortTobyte=(byte)s;
		System.out.println("" +shortTobyte);
		short byteToShort=(short)b;
		System.out.println("" +byteToShort);
		
     
		go(b);
		go(s);
		go(i);
		go(l);
		
		
		
	}

}
