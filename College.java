package INNerClass;

public class College {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
College principle=new College();
//Mechdept m=new College().new Mechdept();
College. Mechdept hod=principle.new Mechdept();
hod.conductsymposium();
principle.conducthodmeeting();

	}
	
	
	class Mechdept{
		
		
		void conductsymposium(){
			Mechdept mc=new Mechdept();
			mc.conductsymposium();
			
		}
	}
	private void conducthodmeeting() {
		// TODO Auto-generated method stub
		Mechdept mc=new Mechdept();
		mc.conductsymposium();
		
	}


}
