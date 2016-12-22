package pAYILAGAM;

import java.util.ArrayList;

public class arr 
{
	public ArrayList a = new ArrayList();
	public ArrayList b = new ArrayList();
	
	public void m()
	{
		for(int i = 0 ; i<=10 ; i++)
		{
		
		
		try {
			a.add("a"+i);
			b.add("b"+i);
			a.wait(2000);
			b.wait(2000);
			System.out.println(a);
			System.out.println(b);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		
		System.out.println(a);
		a.add(b);
		
		System.out.println("ff" + a);
		
		

		
	}
	
	public static void main(String args[])
	{
		arr obj = new arr();
		obj.m();

	}
	
}
