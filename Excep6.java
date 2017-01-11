package Exception;

public class Excep6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			try{
				
				int g=9/0;
//				System.out.println("");
				
			}
		
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
				
			}
			try{
				String name=null;
				System.out.println(name);
				
			}
			catch(NullPointerException e){
				System.out.println(e);
			}
			
			
			/*catch(Exception e){
				System.out.println(e);
			}*/
			
			
		
	}

}
