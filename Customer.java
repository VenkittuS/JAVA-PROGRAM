package pAYILAGAM;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer in =new Customer();
		in.deposit();
		in.withdrawal();
		Bank axis = new Bank();
		axis.getcustomerdetails();
		

	}

	private void withdrawal() {
		// TODO Auto-generated method stub
		
		System.out.println("withdrawal amount limit 2000 because  PM narendra modi fetching rules for blackmoney ");
		
	}

	private void deposit() {
		// TODO Auto-generated method stub
		System.out.println("deposit limit as per gov order 24000 per week");
		
	}

}
