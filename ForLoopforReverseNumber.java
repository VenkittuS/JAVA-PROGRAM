package pAYILAGAM;

import java.util.Scanner;

public class ForLoopforReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		      int a;
		      int reversenum =0;
		      Scanner scanobj = new Scanner(System.in);
		      System.out.println("Input your number and press enter: ");
		     
		     
		      
		   int num = scanobj.nextInt();
		      
		      for( a=num;num >0;a=a/10 ){
		      
		          reversenum = reversenum * 10;
		          reversenum = reversenum + a%10;
		          
		          
		      }

		      System.out.print("Reverse of specified number is: "+reversenum);
		   }}
		
	


