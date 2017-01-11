package EXAM;

import java.util.Scanner;

public class MenuITEM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob =new Scanner(System.in);
		System.out.println("PAYILAGAM SOFTWARE TRAINING INSTITUTE");
		System.out.println("COURSES offered are:");
		System.out.println("1.JAVA");
		System.out.println("2.DOTNET");
		System.out.println("3.PHP");
		System.out.println("4.SOFTWARE TESTING");
		System.out.println("5.ANDROID");
		System.out.println("6.HADOOP");
		System.out.println("7.MYSQL");
		System.out.println("8.C#");
		System.out.println("9.C");
		System.out.println("ENTER UR CHOICEE");
		int n=ob.nextInt();
		
		switch(n){
		case 1:
			System.out.println("java");
			break;
		case 2:
			System.out.println("dotnet");
			break;
		case 3:
			System.out.println("php");
			break;
		case 4:
			System.out.println(" software testing");
			break;
		case 5:
			System.out.println("android");
			break;
		case 6:
			System.out.println("hadoop");
			break;
		case 7:
			System.out.println("my sql");
			break;
		case 8:
			System.out.println("c#");
			break;
		case 9:
			System.out.println("c");
			break;
		}
		
		

	}

}
