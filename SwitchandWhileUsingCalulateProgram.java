package pAYILAGAM;

import java.util.Scanner;

public class SwitchandWhileUsingCalulateProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int say;
	
		Scanner scanobj = new Scanner(System.in);
		do{
			
		
		System.out.println("enter ur choice");
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for div");
		int choice =scanobj.nextInt();
		System.out.println("enter a value");
		int a = scanobj.nextInt();
		System.out.println("enter b value");
		int b = scanobj.nextInt();
		
	switch(choice)
	{
	case 1:
	
		int addvalue=a+b;
		System.out.println("enter add value is:"+addvalue);
		break;
	case 2:
		int subvalue =a-b;
		System.out.println("enter sub value:"+subvalue);
	    break;
	case 3:
		int mulvalue =a-b;
		System.out.println("enter sub value:"+mulvalue);
	    break;
	case 4:
		int divvalue =a-b;
		System.out.println("enter sub value:"+divvalue);
	    break;
	}
	System.out.println("u want to continue");
	System.out.println("say 1 for yes or say 2 for no");
	say = scanobj.nextInt();
	}while (say==1);

}
}
