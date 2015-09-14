package com.nitin.serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;

public class FlattenTime {
    

	public static void main(String[] args) {
		String fileName="time.ser";
		 
		if(args.length > 0){
         fileName=args[0];			
		}
		
		PersistentTime time=new PersistentTime();
		FileOutputStream fis=null;
		ObjectOutputStream os= null;
		
		try{
		
		fis= new FileOutputStream(fileName);
		os= new ObjectOutputStream(fis);
		os.writeObject(time);
		os.close();
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		System.out.println("Actual times" +Calendar.getInstance().getTime());
		
         
	}

}
