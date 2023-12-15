package javaLearning;

public class Constructor {
	
	int empid;
	String salary;
	String company ="infosys";
	
	
	Constructor(){
		System.out.println("testautomation");
	}
	
	
	Constructor (int empid , String salary){
		
		
	}
	
	
	public static void main(String[] args) {
		
		Constructor c = new Constructor();
		c.t1();
		
		
	}

	
	public void t1() {
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(company);
	}
	
	
	
	
	
}


