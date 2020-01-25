package com.sprintqa.java.class11;

import java.util.Scanner;

public class countdigit {
	public static void main(String[] args) {
		
		
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num1 = sc.nextInt();
		//		num=153
		
		while(num1 !=0) {
		 num1 = num1 / 10;
		 count++;
		}
		System.out.println(count);
		
		
		}

		
	}

