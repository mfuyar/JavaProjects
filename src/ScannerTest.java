import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		int  num1=10, num2=20;
		Scanner sc = new Scanner(System.in);
	
	
		System.out.println("Enter between 1-4");
		int userInput = sc.nextInt();
		
		
		if (userInput==1) {
			System.out.println(num1+num2);
		} else if (userInput==2) {
			System.out.println(num1-num2);
		}else if (userInput==3) {
			System.out.println(num1*num2);
		}else if (userInput==4) {
			System.out.println(num1/num2);
			
		}
		
				
		
		
		}
			
						
					}

