package THREADD;


class Mythread extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++){
			Thread.yield();
			System.out.println("yield");
		}
	}
}
public class YIELD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mythread mt=new Mythread();
mt.start();

for(int i=0;i<5;i++){
	System.out.println(i+"main ");
}
	}

}
