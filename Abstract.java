package INTERFACE;

abstract class Abstract {
	abstract void m();
	void n(){
		System.out.println("nn");
	}

	abstract void k();
}
	class Abs extends Abstract{

		@Override
		void m() {
			// TODO Auto-generated method stub
			System.out.println("m");
		}

		@Override
		void k() {
			// TODO Auto-generated method stub
			System.out.println("k");
		}
		
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abs a=new Abs();
a.k();
a.m();
a.n();
	}
	}

