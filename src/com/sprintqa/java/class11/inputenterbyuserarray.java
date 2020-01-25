package com.sprintqa.java.class11;

import java.util.Scanner;

public class inputenterbyuserarray {
	public static void main(String[] args) {

		int numbers[] = new int[5], rollnumber;

	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter number");
	
	numbers[0]= sc.nextInt();
	numbers[1]= sc.nextInt();
	numbers[2]= sc.nextInt();
	numbers[3]= sc.nextInt();
	numbers[4]= sc.nextInt();
	
	for(int i =0; i<numbers.length;i++){
		System.out.println("Roll number?");
		
	rollnumber = sc.nextInt();
	System.out.println(numbers[rollnumber]);

	}
	
	
	
	}
	


}