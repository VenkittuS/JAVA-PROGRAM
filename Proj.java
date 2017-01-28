package BAsiC;
import java.util.HashMap;
import java.util.Scanner;
//import java.util.HashMap;

public class Proj {
	
	static float id;
	static String nam;
static String nap;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("students management system");
System.out.println("1.enter details");
System.out.println("2.insert detals");
System.out.println("3.modify student detail");
System.out.println("4.delete");
System.out.println("5.exits");
int i=(int)sc.nextFloat();
//int i=1;

switch(i)
{
case 1:System.out.println("enter name");
       nap=sc.next();
       System.out.println("enter id");
 id=(float)sc.nextInt();
//System.out.println("your d is"+id);
HashMap hma=new HashMap();
hma.put(id, id);
hma.put(nap, nap);
//System.out.println();
System.out.print(hma.get(nap));
System.out.println("  "+hma.get(id));
System.out.println(hma+"hma is");

System.out.println("ur details saved");
 break;
case 2:
	System.out.println("insert details to students pls enter emp id ");
	int idd=sc.nextInt();
	if(id==idd){
		System.out.println(nap);
		
		

case 3:
		//System.out.println("enter id");
		int ie=sc.nextInt();
		
		
	}
	
	
	


}
	}}
