package EXAM;



class clas1{
	
void method1(){
	System.out.println("method 1");
}
}
class clas2 extends clas1{
	void method2(){
		System.out.println("method 2");
	}
}
class clas3 extends clas2{
	void method3(){
		System.out.println("method 33");
	}
	
}
public class Inheritance extends clas3 {
	
	String name="payilagam";
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inheritance in=new Inheritance();
		in.method1();
		in.method2();
		in.method3();
	
		
	}


	
}
