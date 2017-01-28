package AREAFORall;

import java.util.Scanner;

public class TRIANGLE {
	
	//area=1/2*b*h
	//or
	//area=(b*h)/2
void triangle(){
	Scanner obj=new Scanner(System.in);
	System.out.println("enter base");
	float base=obj.nextFloat();
	System.out.println("enter vertical height");
	float height=obj.nextFloat();
	  float area=(base*height)/2;
	  System.out.println(area);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TRIANGLE t=new TRIANGLE();
		t.triangle();

	}

}
