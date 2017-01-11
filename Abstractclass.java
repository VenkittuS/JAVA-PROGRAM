package EXAM;


abstract class classs1 {
	abstract void m();
		

	void n(){
		System.out.println("method n");
	}
}

public class Abstractclass extends classs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractclass ac=new Abstractclass();
		ac.n();
		ac.m();
	}

	@Override
	void m() {
		// TODO Auto-generated method stub
		System.out.println("implemented method");
	}

}
