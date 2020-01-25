package com.sprintqa.java.class11;

import java.util.Scanner;

public class sumofpositivenadnnegativenumber {
	public static void main(String[] args) {

		int numbers[] = new int[5],positivesum=0,negativesum=0, poscount=0, negcount=0;

	Scanner sc  = new Scanner(System.in);
	System.out.println("Enter number");
	
	
	
	for(int i =0; i<numbers.length;i++){
		numbers[i] = sc.nextInt();
		if (numbers[i]>0) {
			poscount++;
			positivesum = positivesum+numbers[i];
		} else {
			negcount++;
			negativesum = negativesum+numbers[i];
		}
	
	}
		System.out.println(positivesum);
		System.out.println(negativesum);
		System.out.println("Number of positive numbers "+poscount);
		System.out.println("Number of negative numbers "+negcount);
	}
	
	
	
	}
	


