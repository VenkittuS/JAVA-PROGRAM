package Exception;

public class Try2catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try{
			/*int c=5/0;
			System.out.println(c);*/
			/*int [] z=new int[10];
			System.out.println(z);*/
			String name=null;
			System.out.println(name);
		}
		/*catch(ArithmeticException e){
			System.out.println("arithmetic exception");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(z[5]);
			System.out.println(z[100]);
		}*/
		/*catch(NullPointerException e){
			System.out.println("hi");
		}*/
		finally{
			System.out.println("finally block");
		}
	}

}
