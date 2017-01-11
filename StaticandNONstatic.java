package EXAM;

public class StaticandNONstatic {

	
	
	
	static void method1(){
		System.out.println("static method");
	}
	void method2(){
		System.out.println("non static method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticandNONstatic.method1();
		StaticandNONstatic  st=new StaticandNONstatic();
		st.method2();
		
	}

}
