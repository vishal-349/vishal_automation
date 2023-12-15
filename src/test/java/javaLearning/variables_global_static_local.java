package javaLearning;


public class variables_global_static_local {

int empid;
static String company = "tcs";
String salary = "100";


public static void main(String[] args) {

	variables_global_static_local call= new variables_global_static_local ();	
	variables_global_static_local vishal= new variables_global_static_local ();	

	
	call.t1();
	call.t2();
	call.t3();
	vishal.t4();
	
	
	
}


public void t1 () {
	System.out.println(empid);

}

public void t2 () {
	System.out.println(empid);
	System.out.println(company);
}

public void t3 () {
	System.out.println(empid);
	System.out.println(company);
}


public void t4 () {
	System.out.println(salary);

}



	
	
}
