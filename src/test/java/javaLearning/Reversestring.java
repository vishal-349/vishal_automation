package javaLearning;

public class Reversestring {

	public static void main(String[] args) {

		String s = "hello world";
				
				//1st method (using for loop & concatenate)
				
				int len= s.length(); //11
				
				String rev = "";
				
				for (int i= len-1; i>=0 ; i--) {
					
					rev = rev + s.charAt(i);
					
				}
				System.out.println(rev);

				
				// 2nd method (using  stringbuffer class)
				
				StringBuffer sf= new StringBuffer (s);
				System.out.println(sf.reverse());
				
				
				
	}

}
