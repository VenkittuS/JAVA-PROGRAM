package pAYILAGAM;

public class Bankprovideoutput {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		 
		 
      }*/

		
	
	

	protected void getcustomerdetails() {
		// TODO Auto-generated method stub
		System.out.println("customer name :venkittu");
		
	}

public void getcustomerdetails(Customergetvalue customerdetails) {
		// TODO Auto-generated method stub
		System.out.println("calculating loan interest");
		double interest1 =customerdetails.loan1*0.1;
		double interest2 =customerdetails.loan2*0.1;
		System.out.println("interest for customer"+customerdetails.name1 +"is"+interest1 +"\n"+"interest for customer"+customerdetails.name2 +"is"+interest2);
	}



	
	
	}


