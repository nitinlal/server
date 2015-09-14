package com.nitin.geturi;

public class TestGetURI  {

	static String request="http://api.bodybuilding.com/kenjo";
	
	
	public static void main(String[] args) {
		
		String servlet="kenjo/";
        String webhandle=servlet.substring(0,servlet.indexOf("/"));
        
        System.out.println("" + webhandle);
        
        
        
		

	}

}
