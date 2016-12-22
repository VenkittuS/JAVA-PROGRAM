package pAYILAGAM;

public class Bus {
	String passengername1,passengername2,passengername3,passengername4;
	String travel,travel1,travel2,travel3;
	int id1,id2,id3,id4;

	public Bus(Passenger name) {
		// TODO Auto-generated constructor stub
		passengername1=name.name[4];
		passengername2=name.name[3];
		passengername3=name.name[0];
		passengername4=name.name[2];
		travel=name.travelto[4];
		travel1=name.travelto[3];
		travel2=name.travelto[0];
		travel3=name.travelto[2];
		id1=name.passno[4];
		id2=name.passno[3];
		
		id3=name.passno[0];
		id4=name.passno[2];
		System.out.println(passengername1+" "+travel+" "+id1+"\n"+passengername2+" "+travel1+" "+id2+"\n"+passengername3+" "+travel2+" "+id3+" \n"+passengername4+" "+travel3+" "+id4);
		
	}

	public void getroutedetails() {
		// TODO Auto-generated method stub
		
	}

	public void getdestination() {
		// TODO Auto-generated method stub
		
	}

}
