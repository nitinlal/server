package com.nitin.project;

public class EmployeeMain {


	public static void main(String[] args) {
		
		PersistantEmployee e1= new PersistantEmployee();
		e1.setName("Nitin");
		e1.setAge(26);
		e1.setDesignation("programmer");
		
		
		WriteEmployeeToFile.writeObject(e1,"e1.ser");
		ReadEmployeeFromFile.readObject("e1.ser");
	
		
		
		PersistantEmployee e2= new PersistantEmployee();
		e2.setName("Sachin");
		e2.setAge(29);
		e2.setDesignation("senior programmer");
		
		WriteEmployeeToFile.writeObject(e2,"e2.ser");
		ReadEmployeeFromFile.readObject("e2.ser");
	
		
		
	}

}
