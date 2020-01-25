package com.sprintqa.hava.class10;

import java.util.Scanner;

public class patternlogicalprime2 {

	public static void main(String[] args) {
	
	
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number");
		long num = sc.nextInt();
				
		
		boolean prime = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                prime = true;
                break;
            }
        }
        if (!prime)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
				
			
			


