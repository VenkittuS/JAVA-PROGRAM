package EXAM;

public class Methodoverloading {

	void method1(){
		System.out.println(" no paramter");
	}
	void method1(int d,int f){
		System.out.println("double parameter"+"  D VALUE IS"+d+" f value is"+f);
	}
	void method1(int z,int x,int c){
		System.out.println("three parameter"+"  z value is"+z+"x value is "+x+" c value is"+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading mo=new Methodoverloading();
		mo.method1();
		mo.method1(4, 67);
		mo.method1(34, 55, 88);

	}

}
