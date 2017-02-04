package THREADD;

public class Myrunnable  implements Runnable {
	
	
public 	void run(){
	
	
	for(int i=0;i<=10;i++){
		
		try{
		Thread.sleep(2000);
		}
		
		catch(Exception e){
			System.out.println("interrupte");
		}
		
		System.out.println("hiii");
	}
}

}
