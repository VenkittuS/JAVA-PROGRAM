package EXAM;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the name");
		String n=sc.nextLine();
		for(int i=n.length()-1;i>=0;i--){
			char ch=n.charAt(i);
			System.out.print(ch);
			
		}
		
		
		
		

	}

}
