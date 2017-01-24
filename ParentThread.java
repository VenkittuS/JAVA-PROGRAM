
public class ParentThread  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread ct=new ChildThread();
		ct.start();
	for(int i=0;i<5;i++)	{
		System.out.println("parentthread");
	}
		
	}

}
