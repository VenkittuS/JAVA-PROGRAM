package EXAM;
import java.util.Scanner;

public class NumberNOtPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner ob =new Scanner(System.in);
System.out.println("enter ur number");
int n=ob.nextInt();
for(int  i=0;i<10;i++){
	
	if(i==n){
		
	continue;
}
	System.out.println(i);
	}

	}}
