package review23jan;

public class review1 {

	public static void main(String[] args) {

		int num1= 13;
		boolean flag = false;
		
		for (int i=2; i<=num1-1; i++) {
			
			if (num1%i==0) {
				flag= true;
				System.out.println("Not Prime Number");
				break;
			
			
			} 
		}
			if (flag==false) {
				System.out.println("Number is prime");
			}
	
	}
}
