package BAsiC;
enum mobile{
APPLE(200),SAMSUMG,MICROMAX(200);
int price;
mobile(){
System.out.println("constructor");
}
mobile(int price){
	price=200;

}

}
public class Enumeration {

	public static void main(String[] args) {

mobile[] obj=mobile.values();
mobile obj1=mobile.APPLE;
System.out.println(obj1.price);
System.out.println(obj.clone());

System.out.println(obj.equals(obj));

//for( mobile m:obj)
for(mobile m:obj){
	System.out.println(m.APPLE.price);
}
	}

}




