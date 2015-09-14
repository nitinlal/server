package com.nitin.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RetrieveFalttenedObject {

    static String file="time.ser"; 
	
	public static void main(String[] args) {
		
		PersistentTime time=null;
		FileInputStream fos=null;
		ObjectInputStream oos=null;
		
		try{
          fos= new FileInputStream(file);	
          oos= new ObjectInputStream(fos);
          time=(PersistentTime)oos.readObject();
          oos.close();
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("" +time.getTime());

	}

}
