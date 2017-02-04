package THREADD;


class Mythreads extends Thread{
	
	public void run(){
		for(int i=0;i<=5;i++){
			
			System.out.println("safe thread");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
}
public class JOIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mythreads mt=new Mythreads();
mt.start();
try {
	mt.join(1000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

for(int i=0;i<=7;i++){
	System.out.println("shhssh");
}
	}

}
