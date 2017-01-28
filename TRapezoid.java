package AREAFORall;
import java.util.Scanner;

//shape loook like iron box
//trapezoid called in america
//trapezium called in  london

// formula Area=1/2(a+b)*h
public class TRapezoid {
	void trape(){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a ");
		int a=obj.nextInt();
		System.out.println("enter b");
		int b=obj.nextInt();
		System.out.println("enter h");
		int h=obj.nextInt();
		int  Area=1/2(a+b)*h;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
