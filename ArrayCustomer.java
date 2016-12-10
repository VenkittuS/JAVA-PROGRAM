package pAYILAGAM;

public class ArrayCustomer{
	String[] name ={"venkat","venkitu","venkat","venky","jose","dev"};
	int[] id  ={123,222,345,233,465,5667};
	long[] loan  ={50000,10000,5000,3000,4556,5678};
	String[] address={"eraiyur","madurai","cuddalore","nellai","thirupathi","chennai"};
	String[] proof={"pan card","adhaar card","voter id","driving license","ration","voter"};
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayCustomer  in =new ArrayCustomer();
		ArrayBank axis =new ArrayBank();
		axis.details(in);
		

	}

}
