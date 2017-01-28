package BAsiC;
import java.util.Scanner;
public class FAct {
	
	void fact(){
		Scanner obj=new Scanner(System.in);
		System.out.println("ene");
		int in=obj.nextInt();
		 int fact=1;
		 for(int a=in;a>0;a--){
			  fact=fact*a;
			  
			  if(fact==5){
				  System.out.println(" 1 st iter5*1");
			  }
			  else if(fact==20) {
				  System.out.println("  2nd iteration  5*4");
				  
			  }
			  else if(fact==60){
				  System.out.println("  3rd iterat 5*4*3");
			  }
			  else if(fact==120){
				  System.out.println(" 4th iterato  5*4*3*2");
				  
			  }
			  else if(fact==120){
				  System.out.println(" finLlL  11");
			  }
			  else{
				  System.out.println("wrong");
			  }
			  System.out.println(fact);
		 }
			
		
	}
	
	void reversenumber(){
		Scanner objj=new Scanner(System.in);
		System.out.println("sfwe");
		int f=objj.nextInt();
		int d;
		int num;
		while(f!=0){
		
		
			num=f%10;//1234%10=4
			System.out.print(num);
			f=f/10;//1234/10=123
		}
	}
	
	void 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
FAct c=new FAct();
c.fact();
c.reversenumber();
	}

}
