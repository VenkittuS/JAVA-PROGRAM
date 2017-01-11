package Polymorphism;

  class POLY{
void test(){
	System.out.println("test");
}
static void test(int i){
	System.out.println("test with parameter"+i);
}
void test(int i,int j){
	int a=i+j;
	System.out.println("test with two parameter"+a);
}
  static class overload {
	  
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
POLY in=new POLY();
in.test();
in.test(10);
in.test(10,20);
in.test(7);
	}

}
}