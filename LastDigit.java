package pAYILAGAM;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner d =new Scanner (System.in);
		System.out.println("Enter your digit");
		int num=d.nextInt();
		int sum=0;
		while(num!=0){
			int lastdigit=num%10;
			System.out.println("Value is="+lastdigit);
			sum=sum+lastdigit;
			System.out.println("sum="+sum);
		num=num/10;
			
		}
		

	}

}
