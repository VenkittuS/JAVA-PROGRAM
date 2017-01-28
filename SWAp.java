package BAsiC;
import java.util.Scanner;
public class SWAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("entert a a value");
		int a=sc.nextInt();
		System.out.println("enter B VALUE");
		int b=sc.nextInt();
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
