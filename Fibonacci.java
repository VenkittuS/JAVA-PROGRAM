package pAYILAGAM;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,no, first=0, second=1, next;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter nubmer of terms for Series: ");
		no=s.nextInt();
		first=0;
		second=1;
		System.out.println("Fibonacci series are: ");
		  System.out.println(first);
		  System.out.println(second);
		 for(i=0; i<no; i++)
		 {
		 
		  next = first + second;
		  System.out.println(next);
		  first = second;
		  second = next;
		  }
		}
		
	}


