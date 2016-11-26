package pAYILAGAM;

import java.util.Scanner;

public class MyXthMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    

		
		MyXthMark obj = new MyXthMark();
		Scanner scanobj = new Scanner (System.in);
		System.out.println("enter student name");
		String sname = scanobj.nextLine();
		System.out.println("enter tamil mark");
		int mark1 =scanobj.nextInt();
		System.out.println("enter english mark");
		int mark2 =scanobj.nextInt();
		System.out.println("enter maths mark");
		int mark3 =scanobj.nextInt();
		System.out.println("enter science mark");
		int mark4 =scanobj.nextInt();
		System.out.println("enter social mark");
		int mark5 =scanobj.nextInt();
		int addtotal= obj.addtotal(mark1,mark2,mark3,mark4,mark5);
		int avgtotal = obj.avgtotal(addtotal/5);
        
	}

	private int avgtotal(int addtotal) {
		// TODO Auto-generated method stub
		int avgtotal = addtotal/5;
		System.out.println("enter avg value is:"+avgtotal);
		return avgtotal;
		
	}

	private int addtotal(int mark1,int mark2,int mark3,int mark4,int mark5) {
		// TODO Auto-generated method stub
		int addtotal = mark1+mark2+mark3+mark4+mark5;
		System.out.println("enter addd value:"+addtotal);
		return addtotal;
		
		
	}

	

}
