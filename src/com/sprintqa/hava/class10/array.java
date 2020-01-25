package com.sprintqa.hava.class10;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {

		int studentmarks[], nums;
		
		studentmarks = new int [5];
		Scanner sc  = new Scanner (System.in);	
		
		for (int i=0;i<5; i++) {
			System.out.println("Enter number"+i);
			studentmarks[i] = sc.nextInt();
		}
		
		System.out.println("Enter roll");
		nums = sc.nextInt();
		
		System.out.println(studentmarks[i]);
		
	}
		
		
		
	}

