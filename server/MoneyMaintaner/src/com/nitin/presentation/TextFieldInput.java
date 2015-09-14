package com.nitin.presentation;

import java.awt.image.VolatileImage;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextFieldInput {

	public static void main(String[] args) {

		
		System.out.println("Enter Somtheinsdsd");
		BufferedReader inputStream= 
				new BufferedReader(new InputStreamReader(System.in));
		
		int inputString=0;
		boolean stop=false;
		
		try {
			while(!stop){
			 inputString=inputStream.read();
			 
			 if(inputString==0){
				 stop=true;
			 }
			 
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
