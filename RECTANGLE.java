package AREAFORall;

import java.util.Scanner;

public class RECTANGLE {
	//Area=w*h
	void rect(){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter width");
		double w=obj.nextDouble();
		System.out.println("enter height");
		double h=obj.nextDouble();
		double area=w*h;
		System.out.println(area);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RECTANGLE re=new RECTANGLE();
		re.rect();

	}

}
