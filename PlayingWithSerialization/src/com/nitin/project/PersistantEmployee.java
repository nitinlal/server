package com.nitin.project;

import java.io.Serializable;

public class PersistantEmployee implements Serializable{

	private static final long serialVersionUID = -9049451012708953225L;
	private String name;
	private int age;
	private  String designation;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
	
}
