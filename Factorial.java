package BAsiC;

import java.util.Scanner;

public class Factorial {

	void findfacttorials(){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter number");
	int input=obj.nextInt();
	int  fact=1;
		for(int a=input;a>0;a--){
			fact=fact*a;// 1st iteration fact=1*5;5
			//
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fc=new Factorial();
		fc.findfacttorials();

	}

}
