package LOGicall;
import java.util.Scanner;
public class ReverseSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseSTRING rs=new ReverseSTRING();
		rs.reverseString();
	}
	void reverseString(){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter astring");
		String name=sc.nextLine();
		String name2="";
		
		for(int l=name.length()-1;l>=0;l--){
			System.out.print(name.charAt(l));
			name2=name2+name.charAt(l);
			
		}
		System.out.println("  ssname iss  "+name2);
	if(name.equalsIgnoreCase(name2)){
		System.out.println("both are equals");
		
	}
	else{
		System.out.println("both not equals");
	}
		
		
		
		
	}
}
