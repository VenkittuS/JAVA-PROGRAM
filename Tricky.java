package BAsiC;

public class Tricky {
	
	public static void test(String s) {
		System.out.println("In string");
	}
	
	public static void test(Object s) {
		System.out.println("In Object");
	}
	
	public static void main(String[] args) {
		test(null);
	}
}
 