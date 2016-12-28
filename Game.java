package pAYILAGAM;

public class Game implements inter {
	
	String name = null;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

		public static void main(String[] args) {
	     /* String a = "abc";
	      String b = new String("abc");
	
			System.out.println(a.equals(b));
			System.out.println(a==b);
	*/		
			Game g1 = new Game();
			Game g2 = new Game();
			Game g3 = g2;
			g1.setName("Ramki");
			g2.setName("Ramki");
			System.out.println(g1.equals(g2));
			System.out.println(g3.equals(g2));
			
		}
		
		

		@Override
		public boolean equals(Object obj) {
			return this.getName().equals(((Game)obj).getName());
		}

		@Override
		public void interg() {
			// TODO Auto-generated method stub
			
		}
		
	
}

class F
{
		
		public static void main(String args[])
		{
			inter obj = new Game();
			obj.interg();

		}
}