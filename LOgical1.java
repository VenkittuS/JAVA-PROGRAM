package LOGicall;
public class LOgical1{
	public void A(){
		System.out.println("a");
	}
}
 class program extends LOgical1 {

	 public void B(){
		 System.out.println("as");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LOgical1 lo=(LOgical1)new program();
((program)lo).B();
lo.A();
	}

}
