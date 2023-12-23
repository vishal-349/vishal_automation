package javaLearning;

public class RemovejunkFromString {
	
	
	public static void main(String[] args) {
		String s = "@#$%%^& latin string 01234567890";
		
		//method (regular expression) : [^a-zA-Z0-9]
		
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
	}

	

			
	
	
}
