package CONSTRUCTOR;

public class CONSTRUCTOROVERRIDDING {

	public CONSTRUCTOROVERRIDDING(int i, int j) {
		// TODO Auto-generated constructor stub
	}
	public CONSTRUCTOROVERRIDDING(int i, int j, int k) {
		// TODO Auto-generated constructor stub
	}
	public class ConRide extends CONSTRUCTOROVERRIDDING{

		
	

	public ConRide(int i) {
			// TODO Auto-generated constructor stub
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CONSTRUCTOROVERRIDDING obj=new CONSTRUCTOROVERRIDDING(33,44);
		CONSTRUCTOROVERRIDDING obj2 =new CONSTRUCTOROVERRIDDING(44,33,55);
		ConRide objj=new ConRide(45);
		
	}

}
