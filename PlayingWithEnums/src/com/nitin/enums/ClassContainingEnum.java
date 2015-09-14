package com.nitin.enums;

public class ClassContainingEnum {
	
	public enum WeekDays{
	
		
		 MONDAY("monday"),TUESDAY("tuesday"),WEDNESDAY("wednesday");
		 
		 String weekdays;
		 
		 private WeekDays(String weekdays) {
			 
			 this.weekdays=weekdays;
		}
	
		 public String getStringValue(){
			 return weekdays;
		 }
		 
		
		 
		 
	}
	
 
	
	public static void main(String args[]){
		
	
		
	}
	
	
	

}
