package com.nitin.project;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadEmployeeFromFile {

	
	public static Object readObject(String file){
		
		Object returnedObject=null;
		try{
				
		FileInputStream fis= new FileInputStream(file);
		ObjectInputStream ois= new ObjectInputStream(fis);
		returnedObject=(Object)ois.readObject();
		
		System.out.println("name: " +((PersistantEmployee)returnedObject).getName());
		System.out.println("age: " +((PersistantEmployee)returnedObject).getAge());
		System.out.println("designation: "+((PersistantEmployee)returnedObject).getDesignation());
        System.out.println();
		
		ois.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return returnedObject;
	}
	

}
