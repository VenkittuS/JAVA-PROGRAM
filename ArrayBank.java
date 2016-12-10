package pAYILAGAM;

public class ArrayBank {
	

	public void details(ArrayCustomer customerdetails) {
		// TODO Auto-generated method stub
		System.out.println("calculate interest");
		double interest1 =customerdetails.loan[1]*0.1;
		double interest2 =customerdetails.loan[2]*0.1;
		double interest4 =customerdetails.loan[4]*0.1;
		
		System.out.println("interest for customer  "+customerdetails.name[1]+ customerdetails.id[1]+ customerdetails.address[1]+ customerdetails.proof[1]+" is" +interest1+"\n"+"interest for customer"+customerdetails.name[2]+customerdetails.id[2]+customerdetails.address[2]+customerdetails.proof[2]+"is"+interest2+"\n"+"interest for customer"+customerdetails.name[4]+customerdetails.id[4]+customerdetails.address[4]+customerdetails.proof[4]+"is"+interest4);
		
		
	}}

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	


