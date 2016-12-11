package pAYILAGAM;

public class CallingMethodinSameClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    method1();
    method2();
	}

	private static void method2() {
		// TODO Auto-generated method stub
		System.out.println("hello payilagam");
		
	}

	private static void method1() {
		// TODO Auto-generated method stub
		method2();
		
	}

}
