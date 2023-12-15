package pages;

public class Registration {

	public void loginWithUsername() {
		
		System.out.println("vishal");
	}
	
	public void loginWithOtp() {
		System.out.println("tyagi");
		
	}
	
	public static void main(String[] args) {
		//how create a object method
		// classname objectname = new classname
		
		Registration login = new Registration ();
		login.loginWithUsername();
		login.loginWithOtp();
	
	}
	
	
	
	
}
