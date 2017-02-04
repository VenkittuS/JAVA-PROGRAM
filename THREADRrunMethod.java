package THREADD;


class mythread extends Thread{
	public void run(){
		
		for(int i=0;i<=10;i++){
		System.out.println("hh");
		}
	}
	

}
public class THREADRrunMethod {

	
	public static void main(String [] args){
		mythread mt=new mythread();
		
		mt.start();
		
		
		
		
		for(int i=0;i<=10;i++){
			System.out.println("hdhdhdhd");
		}
	}
}
