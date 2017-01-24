
public class Threadd 
{
	Threadd()
	{
		System.out.println("0");		
	}
	Threadd(int a)
	{
		System.out.println("1");
		Threadd obj =  new Threadd();

	}
	Threadd(int a,int b)
	{
		System.out.println("2");
		Threadd obj =  new Threadd(1);

	}
	Threadd(int a,int b,int c)
	{
		System.out.println("3");
		Threadd obj =  new Threadd(1,2);

	}
	Threadd(int a,int b,int c,int d)
	{
		System.out.println("4");
		Threadd obj =  new Threadd(1,2,3);

	}
	Threadd(int a,int b,int c,int d,int e)
	{
		System.out.println("5");
		Threadd obj =  new Threadd(1,2,3,4);
	}
	
	public static void main(String args[])  throws Exception
	{
		Threadd obj =  new Threadd(1,2,3,4,5);
	}

}
