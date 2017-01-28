package ENUM;

public class ENumerations {
	
	enum Days{
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY;
	}
	
	static {
		main(null);
	}

	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String intval = "123";
		String floatval = "12.34";
		String boolval = "false";///given   true=true... and false=false..and venkittu=false
		int ival = 123;
		float fval = 123.23F;
		 boolean bval = Boolean.parseBoolean(boolval);
		System.out.println("Boolean Val : " + bval);
		
		//try {
		System.out.println("Float Val : " + Float.parseFloat(floatval));
		System.out.println("Integer Val : " + Integer.parseInt(intval));
		
		//catch(NumberFormatException e) {
			System.out.println("Enter the valid input : " + floatval);
		
		Days dd=Days.SUNDAY;
		System.out.println(dd+"adasdasda");
		
		
		for(Days d:Days.values()){
			System.out.println(d+"  first");
			//System.out.println("first");
		  	weekend(d);
		}

	}
	
	public static void weekend(Days d){
		if(d.equals(Days.SUNDAY)){
			
			System.out.println(d+"is holi");
			
		}
		
		else{
			System.out.println(d+"working day");
		}
	}

}
