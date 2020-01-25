package com.sprintqa.java.class13;

public class StringManipu2 {

	public static void main(String[] args) {
		
		
	//	String str1 = "         Welcome to SprintQA         ";
		
		
	//System.out.println(str1.trim());
		
		
		//String str1 = "I am an Automation Engeneer";
		
		
		/*
		 * String str4 = new String("Welcome to SprintQa");
		 * 
		 * 
		 * 
		 * System.out.println(str4.substring(str4.indexOf("S")));
		 * 
		 * String companyname= "Ebay" String title="Welcome+ companyname+ something....
		 */
		//String original = "SprintQa"; //reverse
	
		
	//for(int i=1; i<=original.length();i++)
	//System.out.println(original.charAt(original.length()-i));
int sum=0;

String str8 = "This is Fatih from SprintQA";

String[] words = str8.split(" ");

for (int k=0;k<(words.length);k++) {
//System.out.println(words[k]);

int i=0; i++;
sum= sum+i;


}	
System.out.println(words.length);	
System.out.println("Number of words in 'str8' are "+sum);	
	} 
	}
	


	

