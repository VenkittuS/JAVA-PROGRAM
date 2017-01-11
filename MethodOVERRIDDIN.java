package EXAM;
 class method{
	 void m(int a,int d){
		 System.out.println("method m");
	 }
 }
public class MethodOVERRIDDIN extends method {

	void m(int a, int d){
		System.out.println("method m1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method m=new Method();
		m.m(4, 5);
		
		

	}

}
