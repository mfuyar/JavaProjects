package com.sprintqa.hava.class10;

public class prime2 {

	public static void main(String[] args) {
		
		
		for (long num = 1; num <= 154468 ; num++)
			
			for (int j = 2;j <= 10; j++)
				
			
				if (num==1 || num==-1) {
					System.out.println(num+" is not a prime number");
					break;
				}else if (num!=2 && num!=3 && (num%j==0 || num%(j+1)==0)) {
					System.out.println(num+" is not a prime number.");
					break;
				} else{
					System.out.println(num+" is a prime number.");
					break;
				} 
					
				}
}


/*int i = 1; // 1. Initialization

while (i <= 10) { // 2. Condition
	System.out.println("Hello World!");
	i++; // Increment / decrement
}

System.out.println("Value of i= " + i);

System.out.print("End of program.....");*/