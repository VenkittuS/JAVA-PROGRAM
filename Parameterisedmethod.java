package EXAM;

public class Parameterisedmethod {
	
	
	public void method1(){
		System.out.println("no return type method");
	}

	public int method2( ){
		int d1=7;
		System.out.println("return type method");
		return d1;
	}
	void method3(int a, int b,int c){
		System.out.print ("parameterised method   "+a+""+b+""+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterisedmethod p=new Parameterisedmethod();
	     p.method1();
		p.method2();
		p.method3(3, 4, 5);

	}

}
