package THREADD;


class mythreads extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("hiiiiii");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
public class INTERRUPTIONofTHREADS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		mythreads mt=new mythreads();
		mt.start();
		mt.interrupt();
		System.out.println("ned of main mmeha");
	}

}
