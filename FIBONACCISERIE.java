package LOGicall;
import java.util.Scanner;

public class FIBONACCISERIE {

	
	static public final synchronized  strictfp void main(String ... args){
		
		FIBONACCISERIE fb=new FIBONACCISERIE();
		fb.fibonacci();
	}
	void fibonacci(){
		Scanner  sc=new Scanner(System.in);
		/*int a=sc.nextInt();
		int b=sc.nextInt();//a
		int c=a+b;//b
		
*/		
		int a=0,b=1,c;
		
		/*System.out.println(a);
		System.out.println(b);*/
	
		c=a+b;
		
		System.out.println(c);
		while(c<13){
		a=b;//a=1;a=1;2,3,5,
		b=c;//b=1;b=2;3,5,8
		c=a+b;
		System.out.println(c);///2,3,5,8,13
		
		
		
	}
		
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("vba"+a+"asha"+b);
		
		
		
		/*a=b;
		b=c;
		c=a+b;
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
		System.out.println(c);*/
		
	}
}
