package Exception;

public class FinallyinsideTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	int d=5/0;
	System.out.println("try block");
	
}
catch(ArithmeticException ae){
	System.out.println("catch block");
}
finally{
	try{
		int a[]=new int[10];
	}
	catch(Exception e){
		
	}
	finally{
		System.out.println("hi");
	}
}
	}

}
