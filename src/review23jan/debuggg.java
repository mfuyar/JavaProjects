package review23jan;

public class debuggg {

	public static void main(String[] args) {

		int numbers[]= {14,56,37,0,23,9,2,80,67}, min=0, temp=0, indexofmin=0;
		
		for (int i=0; i<numbers.length-1; i++) {
		
		min= numbers[i];
		for (int j=i; j<numbers.length; j++) {
			if (numbers[j]<min) {
				min=numbers[j];
				indexofmin=j;
			//System.out.println(j);
			}
		}
		
		temp=numbers[indexofmin];
		numbers[indexofmin]=numbers[i];
		//numbers[i]=temp;
		System.out.println(temp);
		}
		
		
		for (int i=0; i<numbers.length-1; i++) {
			//System.out.println(numbers[i]);
		}
	}
}