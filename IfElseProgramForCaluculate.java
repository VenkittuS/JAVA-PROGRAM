package pAYILAGAM;

import java.util.Scanner;

public class IfElseProgramForCaluculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfElseProgramForCaluculate obj = new IfElseProgramForCaluculate();
		Scanner scanobj =new Scanner(System.in);
		int say;
		do{
		System.out.println("enter ur choice");
		System.out.println("press 1 for add");
		System.out.println("press 2 for sub");
		System.out.println("press 3 for mul");
		System.out.println("press 4 for div");
		int choice =scanobj.nextInt();
		System.out.println("enter a value");
		int a = scanobj.nextInt();
		System.out.println("enter b value");
		int b = scanobj.nextInt();
		
       if(choice==1){
    	   int add =a+b;
    	   System.out.println("add value is:"+add);
       }
    	   else if(choice==2)   {
    		   int sub =a-b;
    		   System.out.println("sub value is:"+sub);
    	   }
    		   else if(choice==3)
    		   {
    			   int mul = a*b;
    			   System.out.println("mul value is:"+mul);
    		   }
    		   else if(choice==4){
    			   int div = a/b;
    			   System.out.println("div value :"+div);
    		   }
    		   System.out.println("u want to continue");
    		   System.out.println("say yes for 1 or no for 2");
    		   say = scanobj.nextInt();
    		   }while(say==1);
       
    	   }
       }

