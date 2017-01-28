package ENUM;
import java.util.Scanner;

public class REVERSEnumber {

	public static void main(String[] args) {
Scanner obj=new Scanner(System.in);
System.out.println("ente number");
int a=obj.nextInt();//567
int reverse = 0;
while(a!=0)
	reverse=reverse*10;
	reverse=reverse+a%10;
	a=a/10;
	
	}
	
}

