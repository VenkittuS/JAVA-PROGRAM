package Polymorphism;


 class Ridding {

	public void m(){
		System.out.println("ddd");
	}
 }
	class Ride extends Ridding{
		public void m(){
			System.out.println("dddd");
		}
	
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ride in=new Ride();
		in.m();
	}


}