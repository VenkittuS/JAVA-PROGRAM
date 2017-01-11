package Exception;

import java.util.Scanner;

public class ARITTHMetic {
	
	public static void add() {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a vlaue");
		int a=sc.nextInt();
		System.out.println("enter b vlue");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println("please check value");
			
		}
		
		finally{
			System.out.println("hi  ");
		}
		add();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		add();
	}

	
}