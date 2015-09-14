package com.nitin.project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteEmployeeToFile {
	
 public static void writeObject(PersistantEmployee obj, String file){
	
	 try {
		FileOutputStream fos= new FileOutputStream(file);
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(obj);
		oos.close();
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch(Exception e){
		e.printStackTrace();
	}
	 
 }
 
 

}
