package EXAM;


 class acces{
	private void m(){
		System.out.println("private ");
	}
	
	public void n(){
		System.out.println("public");
	}
	protected void h(){
		System.out.println("protected");
	}
 }
	
	
	public class Accesmodifier extends acces  {
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		acces am= new acces();
		am.h();
		am.n();
	}
	
}