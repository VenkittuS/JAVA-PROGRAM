package Exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	try{
		
		int c=5/0;
		System.out.println(c);
		
	}
	
	catch(ArithmeticException e){
		System.out.println("arthimetic ");
	}
	/*finally{
		System.out.println("finally block");
	}*/

}
}