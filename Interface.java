package INTERFACE;

public interface Interface {

	void m();
	 void n();
	
	class Inter implements Interface{

		
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
			//inter in=new inter();
			Interface h=new Inter();
			h.m();
			h.n();
			String name = null;
			Integer integer = null;

			name = name != null ? "Ramki" : "";
			
			
			if (name != null) {
				name = "Ramki";
			}else {
				name = "";
			}
		}
	}
	

