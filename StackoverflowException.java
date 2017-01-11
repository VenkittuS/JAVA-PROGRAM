package Exception;
try{
public class StackoverflowException {

	public static void m1() {
		// TODO Auto-generated method stub
 m2();
	}
	public static void m2() {
		// TODO Auto-generated method stub
m1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
m1();
	}

}
}