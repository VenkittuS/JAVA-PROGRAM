package EXAM;

 interface CLAS1s {
	void g();
	void k();
	void s();
	 interface clas2 {
		 void l();
		 void w();
		 void z();
	 }
	 
	 public class clas3 implements CLAS1s,clas2{

		@Override
		public void l() {
			// TODO Auto-generated method stub
			System.out.println("method i");
		}

		@Override
		public void w() {
			// TODO Auto-generated method stub
			System.out.println("method w");
		}

		@Override
		public void z() {
			// TODO Auto-generated method stub
			System.out.println("method z");
		}

		@Override
		public void g() {
			// TODO Auto-generated method stub
			System.out.println("method g");
		}

		@Override
		public void k() {
			// TODO Auto-generated method stub
			System.out.println("methos k");
		}

		@Override
		public void s() {
			// TODO Auto-generated method stub
			System.out.println("methos s");
		}
		 
	 }
		 public static void main(String[]args){
			 clas3 c=new clas3();
			 c.g();
			 c.k();
			 c.l();
			 c.s();
			 c.w();
			 c.z();
		 }
	 
	
	

}
