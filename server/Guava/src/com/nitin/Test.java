package com.nitin;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class Test {

	public static void main(String args[]){
		List<String> fruits= Arrays.asList("banana","water melon", "apple","pineapple", "berris");
		List unmodified=Collections.unmodifiableList(fruits);
		ImmutableList<List<String>> immutableList=ImmutableList.of(fruits);
		System.out.println(fruits);
		System.out.println(fruits);
		
	}
}
