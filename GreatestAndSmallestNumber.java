package EXAM;

import java.util.Scanner;

public class GreatestAndSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan =new Scanner(System.in);
System.out.println("enter n input");
int n=scan.nextInt();
System.out.println("enter v input");
int v=scan.nextInt();
System.out.println("enter m input");
int m=scan.nextInt();
System.out.println("enter k input");

int k=scan.nextInt();

if(n>v&&n>m&&n>k){
	System.out.println("n is largest number");
	
}
if(v>n&&v>m&&v>k){
	System.out.println("v is largest");
	
}
if(m>v&&m>n&&m>k){
	System.out.println("m is largest");
	
}
if(k>n&&k>v&&k>m){
	System.out.println("k is largest");
}


	}

}
