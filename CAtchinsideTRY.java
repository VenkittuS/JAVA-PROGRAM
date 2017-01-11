package Exception;

public class CAtchinsideTRY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	int c=5/0;
	
}
catch(Exception e){
	System.out.println("hi");
try{
	System.out.println("inside try class");
	
}

catch(ArithmeticException ae){
	System.out.println("inside catch block");
}
System.out.println("outer catch");
}


	}

}
