package com.sprinta.java.class1;

import java.util.Scanner;

public class Scannersample2 {
  public static void main(String[] args) {
	  
    Scanner myObj = new Scanner(System.in);
   
    
    System.out.println("Enter age and weight:");

        		
        // Numerical input
    int age = myObj.nextInt();
    int weight = myObj.nextInt();
    
    if (age>18 && weight>50) {
    System.out.println("Eligible For Blood Donation");
  } else {
    	System.out.println("Not Eligible");
  }

    // Output input by user
    
    
  }
} 


