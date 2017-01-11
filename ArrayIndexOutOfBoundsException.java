
 
package Exception;


public class ArrayIndexOutOfBoundsException {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try{
	String s=null;
	System.out.println(s.length());
	int []a=new int[10];
	System.out.println(a[100]);
	
}
catch(NullPointerException e){
	System.out.println("array out indes");
	
}
catch(ArrayIndexOutOfBoundsException e){
	
}
	}

}













































