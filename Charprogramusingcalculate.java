package pAYILAGAM;

import java.util.Scanner;

public class Charprogramusingcalculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int say;
			Scanner in =new Scanner(System.in);
			do{
			
				
				
				


	          System.out.println("enter a value:");
	          int a = in.nextInt();
	          System.out.println("enter b value");
	          int b = in.nextInt();
			 System.out.println("enter urchoice");
				String choose=in.next();
				choose.charAt(0);
	         
	          

					   switch (choose)
					   {
					   case "+" :
							int add =a+b;
							System.out.println("add value is:"+add);
							break;
						
						case "-":
							 float sub =a-b;
							 System.out.println("sub is:"+sub);
							 break;
						
						case "*":
							int mul = a*b;
							System.out.println("mul is:"+mul);
							break;
							
						
						case "/":
							double div =a/b;
							System.out.println("div is:"+div);
							break;
							default:
								System.out.println("the incorrct");
					   }
							System.out.println("u want to continue");
							System.out.println("say yes for 1 or say no for 2");
							say =in.nextInt();
			}while(say==1);
		     			 
			}
					   

		

		

	}


