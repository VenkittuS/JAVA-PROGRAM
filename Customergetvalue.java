package pAYILAGAM;

public class Customergetvalue {
	String name1="venkittu";
	int id1 =1234;
	long loan1=50000;
	String name2 ="venkat";
	int id2 =236623;
	long loan2=10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customergetvalue in =new Customergetvalue();
	/*	in.deposit();
		in.withdrawal();*/
		Bankprovideoutput axis = new Bankprovideoutput();
		axis.getcustomerdetails(in);
		
		
		

	}

private	void withdrawal() {
		// TODO Auto-generated method stub
		
		System.out.println("withdrawal amount limit 2000  ");
		
	}

	private void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit limit as per gov order 24000 per week");
		
	}

}
