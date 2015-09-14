package com.nitin.enums;

import com.nitin.enums.ClassContainingEnum.WeekDays;

public class AccessingEnum {

	public static void main(String[] args) {
		
		//to access an Enum is a class
		//does not require instiation
		WeekDays day = ClassContainingEnum.WeekDays.MONDAY;
		System.out.println("" +day.getStringValue());

	}

}
