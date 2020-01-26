package com.sprinqa.java.class4;

import java.util.Scanner;

public class NestedIfElse {
  public static void main(String[] args) {
	  
    Scanner myObj = new Scanner(System.in);
   
    
    System.out.println("Enter name, age and salary:");

    String name = "Fatih";
    		
    // String input
    String guess = myObj.nextLine();

    // Numerical input
    int age = myObj.nextInt();
    
    double salary = myObj.nextDouble();

    // Output input by user
    
    if(name.contentEquals(guess)) 
    {
    	
    System.out.println("Name: " + guess);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
    } else {
    	System.out.println("False Name");
    }
  }
} 


