package pAYILAGAM;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,no,table;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter any number: ");
		no=s.nextInt();
		for(i=0; i<=100; i++)
		{
		table=no*i;
		System.out.println(table);
		}
		
		
	}

}
