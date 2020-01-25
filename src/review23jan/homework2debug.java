package review23jan;

public class homework2debug {

	public static void main(String[] args) {

		String str = "This is string program we learning from java concept";		
		char c = 't';
		
		int count=0;
		String str2=str.toLowerCase();
				for (int i=0; i<str2.length();i++) {
					str2.charAt(i);
					if(str2.charAt(i)==c||str2.toUpperCase().charAt(i)==c) {
						count++;
					}
					
				}
		
		System.out.println(count);
		
	}
}
