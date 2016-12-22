package pAYILAGAM;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,largestno;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter ur number");
		a=obj.nextInt();
		b=obj.nextInt();
		c=obj.nextInt();
		if(a>=b && a>=c)
		{
			System.out.println("largest no:"+a);
		}
		if(b>=a && b>=c){
			System.out.println("largets:"+b);
			
		}
		if(c>=b && c>=a){
			System.out.println("larrgest no:"+c);
		}
	}
	
	

}
