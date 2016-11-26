package pAYILAGAM;

import java.util.Scanner;

public class WhileUsingcaculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhileUsingcaculate mark = new WhileUsingcaculate();
		
		int studentcount = 0;

		while (studentcount<=5){
			Scanner in =new Scanner(System.in);
		int subjectcount = 0;

		String sname;
		System.out.println("enter student name:");
		java.lang.String sname1= in.nextLine();
		studentcount=studentcount+1;
		subjectcount=subjectcount+1; 
		System.out.println("enter the mark:");
		int mark1 = in.nextInt();
		int mark2 = in.nextInt();
		int mark3 = in.nextInt();
		int mark4 = in.nextInt();
		int mark5 =in.nextInt();





		 int total = mark.add(mark1,mark2,mark3,mark4,mark5);
		 float avg = mark.avg(total);
		System.out.println("enter total mark:"+mark.add(mark1,mark2,mark3,mark4,mark5));
		System.out.println("enter total avg:"+mark.avg(total));

	}

}

	private int add(int mark1, int mark2, int mark3, int mark4, int mark5) {
		// TODO Auto-generated method stub
		int addtotal =(mark1+mark2+mark3+mark4+mark5);
		return addtotal;
	}

	private float avg(int total) {
		// TODO Auto-generated method stub
		float avg = (total)/5;
		return avg;
		
	}
}
