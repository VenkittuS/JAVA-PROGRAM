package LOGicall;
import java.util.Scanner;
public class ArmsSTRONG {
int m,s,arms;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArmsSTRONG as=new ArmsSTRONG();
as.ARMS();

	}

	public void ARMS() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numeber");
        int a=		sc.nextInt();
do{
              m=a%10;//371%10=1
               arms=m*m*m;//1*1*1;=1
               System.out.print(arms);//1
 a=a/10;              ///371/10=37
               
}while(a>0);

	}

}
