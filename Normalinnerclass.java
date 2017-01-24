package INNerClass;

public class Normalinnerclass {
	
	String name="outerclass";
void outer(){
	inner obj=new inner();
	obj.m();
	
	System.out.println(name);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Normalinnerclass.inner in=new Normalinnerclass().new inner();
           in.m();
           
           new Normalinnerclass().outer();

	 
	}
	class inner{
		String name="inner class";
		
		void m(){//// inside method
			
			String name="inner method";
			System.out.println("inner");
			System.out.println(name);
			System.out.println("hiiii   "+this.name);
			System.out.println("  ou class "+Normalinnerclass.this.name);
			
		}
	}
}
