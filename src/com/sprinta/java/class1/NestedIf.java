/*This is Fatih
 * He done these programming
 */

package com.sprinta.java.class1;

import java.util.Scanner;

public class NestedIf {
  public static void main(String[] args) {
	  
    Scanner sc = new Scanner(System.in);
   
    
    System.out.println("Enter age and weight, count");

        		
        // Numerical input
    int age = sc.nextInt();
    int weight = sc.nextInt();
    int bloodc = sc.nextInt();
    
    if (age>18) {
    	if (weight>50) {
    		if (bloodc >100){
    System.out.println("Eligible For Blood Donation");
  } else {
    	System.out.println("Not Eligible");
  }

    // Output input by user
    
    
  }
    }
  }
}


