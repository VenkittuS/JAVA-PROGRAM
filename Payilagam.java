package pAYILAGAM;

 interface Payilagam{
	 abstract  void java();
	 
	 abstract  void dotnet();
	 
	 
      abstract void sql();
	 
	 
	
		 
	 }
 
 interface pppp{
	 abstract  void j();
	 
	 abstract  void dot();
	 
	 
      abstract void sq();
      
 }
	 class course implements Payilagam,pppp  {
		 
		public void java()
		 {
			 System.out.println("java");
		 }
		 public  void dotnet(){
			 System.out.println("dotnet");
		 }
		 public void sql(){
			 System.out.println("sql");
		 }
		 public void j()
		 {
			 System.out.println("java");
		 }
		 public  void dot(){
			 System.out.println("dotnet");
		 }
		 public void sq(){
			 System.out.println("sql");
		 
		 }
	 
	 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Payilagam sft =new course();
		pppp sf =new course();
		sft.dotnet();
		sft.java();
		sft.sql();
		sf.j();
		sf.sq();
		sf.dot();
	
		
		

	}
	

}
