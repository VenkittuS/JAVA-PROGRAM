package pAYILAGAM;

public class Passenger {
	String name[]={"venkittu","jose","naren","dev","muthu","ramana"};
	String travelto[]={"eraiyur","nellai","chennai","trichy","tuticorn","andhra"};
	int passno[]={123,234,456,444,456,666};
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Passenger name =new Passenger();
Bus govt= new Bus(name);
govt.getroutedetails();
govt.getdestination();
	}

}
