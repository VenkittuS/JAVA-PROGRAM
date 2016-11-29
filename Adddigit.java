package pAYILAGAM;

import java.util.Scanner;

public class Adddigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanobj = new Scanner(System.in);
		int a;
		int reverse;
		System.out.println("please enter your reverse number");
		a = scanobj.nextInt();
		while(a!=0){
			reverse = a%10;
			System.out.print(+reverse);
			a=a/10;
		}
		

	}

}
