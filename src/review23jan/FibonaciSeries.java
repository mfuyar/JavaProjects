package review23jan;

public class FibonaciSeries {

	
	//0 1 1 2 3 5 8 13
	
	public static void main(String[] args) {

		int limit=100, num1=0, num2=1, sum=0;
		
		
		System.out.println(num1);
		System.out.println(num2);
		sum= num1+num2;
		
		while (sum<limit) {
			System.out.println(sum);
			num1=num2;
			num2=sum;
			sum=num1+num2;
	
	
		}	

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
