package CONSTRUCTOR;


public class ConstructorOverloading {
	int room,rent;
	String name1;
	int addrent;
	int eb;
	
	public ConstructorOverloading(int i, int j) {
		// TODO Auto-generated constructor stub
		room=i;
		rent=j;
		
	}

	public ConstructorOverloading(int i, int j, int k) {
		// TODO Auto-generated constructor stub
		addrent=k;
	}

	public ConstructorOverloading(int i,String name) {
		// TODO Auto-generated constructor stub
		name1=name;
	}

	public void men() {
		// TODO Auto-generated method stub
		System.out.println("men room rent");
		int results=rent*eb;
		System.out.println(results);
		
	}

	public void women() {
		// TODO Auto-generated method stub
		System.out.println("women room rent");
		int results=rent*eb;
		System.out.println(results);
		
	}

	public void mannn() {
		// TODO Auto-generated method stub
		
	}
	
}

 class Hostel{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ConstructorOverloading in=new  ConstructorOverloading(2500,3000);
		 in.men();
		 ConstructorOverloading in1=new  ConstructorOverloading(250,300,4000);
		 in.women();
		 ConstructorOverloading in3=new  ConstructorOverloading(5000,"venkittu");
		 in.mannn();
		 
		 
	}

}
