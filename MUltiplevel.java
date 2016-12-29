package INHERITANCE;
class A{
	void m(){
		System.out.println("a method");
	}
	void n(){
		System.out.println("n method");
	}
}
 class B extends A{
	 void h(){
		 System.out.println("h method");
	 }
	 void j(){
		 System.out.println("j method");
	 }
}
 class c extends B{
	 void k(){
		 System.out.println("k method");
	 }
 }
public class MUltiplevel extends c {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MUltiplevel b=new MUltiplevel();
		b.h();
		b.j();
		b.m();
		b.k();
		
		
	}

}
