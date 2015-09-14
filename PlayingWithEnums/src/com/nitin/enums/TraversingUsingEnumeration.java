package com.nitin.enums;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;

public class TraversingUsingEnumeration {

	
	
	public static void main(String[] args) {
		
		
		ArrayList<Employee> employees= new ArrayList<Employee>();
		Employee employee1= new Employee();
		employee1.setName("Sachin");
		Employee employee2= new Employee();
		employee2.setName("Nitin");
		Employee employee3= new Employee();
		employee3.setName("Summi");
		
		
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		
		
		Enumeration<Employee> enums= Collections.enumeration(employees);
		
		while(enums.hasMoreElements()){
			System.out.println("" +enums.nextElement().getName());
		}
		
		
	}

}
