package com.sprintqa.java.class13;

public class StringManipu {

	public static void main(String[] args) {
		
		
		String str1 = "This is a ebay website where you can do online grocery shopping";
		String str2 = new String("Hello");
		String str3 = "WELCOME TO EBAY";
		String str5 = "Ebay to welcome";
		String str4 = new String("hello");
		

		
		//System.out.println(str2==str4);
		//System.out.println(str1==str3);
		//System.out.println(str1.contains("ebay"));
		
		//System.out.println(str1.toUpperCase());
		//System.out.println(str3.toLowerCase().contains(str5.toLowerCase()));
	
		
		//System.out.println(str4.charAt(str4.length()-1));
		
	String original = "SprintQa"; //reverse
	
	for(int i=1; i<=original.length();i++)
	System.out.println(original.charAt(original.length()-i));
	

		
		
	}
	
	
	
	
}
