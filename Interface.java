package INTERFACE;

public interface Interface {

	void m();
	void n();
	
	class inter implements Interface{

		
		public void m() {
			// TODO Auto-generated method stub
			System.out.println("m");
		}

		@Override
		public void n() {
			// TODO Auto-generated method stub
			System.out.println("n");
		}
		
	}
	
		public static void main(String[] args){
			inter in=new inter();
			in.m();
			in.n();
		}
	}
	

