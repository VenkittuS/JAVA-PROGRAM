package INNerClass;

public class MethodlocalINnerClass {
	private int n=400;
	void m()
	{
		method1 a=new method1();///because it is inner class
		System.out.println("hi");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//MethodlocalINnerClass mli=new MethodlocalINnerClass();
		// MethodlocalINnerClass.innermethod in=new MethodlocalINnerClass().new innermethod();
	new MethodlocalINnerClass().m();
	new MethodlocalINnerClass().method1();
	}
	
	void method1(){
		
		class A{
			private int num =1000;
			void innermethod(){
				//int num1=num++;//is not possible
				int num1=num+34;
				System.out.println("innermethod");
				System.out.println(num1);
			}
			
			}A a=new A();
			a.innermethod();
			}
		}
	
	
