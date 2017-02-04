package THREADD;

public class GETTandSETname /*extends Thread */implements Runnable  {

	void start(){
		for(int i=0;i<=5;i++){
			System.out.println("start");
			if(i==2){ 
				Thread.yield();
			}
			
			
			}
		
	}
	
	
	
	public static void main(String []args){
		
		
		GETTandSETname  get=new GETTandSETname ();
		get.start();
		get.run();
		
		//System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("venkittu");
	}
	
	public void run(){
		
		for(int i=0;i<=10;i++){
			if(i==7){
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}}
			System.out.println(Thread.currentThread().getName());
		}
	}
}
