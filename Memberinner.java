package INNerClass;

public class Memberinner {

	private int data=300;
	
	class inner{
		
		void msg(){
			System.out.println("date is"+data);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Memberinner mi=new Memberinner();
		Memberinner.inner in=mi.new inner();
		in.msg();
	}

}
