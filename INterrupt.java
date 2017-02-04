package THREADD;


class mythreadd extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("run method");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
public class INterrupt {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mythreadd  mt=new mythreadd();
		mt.start();
		mt.interrupt();
		
		
		System.out.println("end of main method");

	}

}
