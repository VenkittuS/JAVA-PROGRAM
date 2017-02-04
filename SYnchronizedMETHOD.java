package THREADD;


class table{
	synchronized void printTable(int n){
		for(int i=0;i<=7;i++){
			System.out.println("hii");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Mythreadss extends Thread{
	table t;
	/*Mythread(table t){
		this.t=t;
	}*/
	
	public Mythreadss(table t2) {
		
		// TODO Auto-generated constructor stub
		
		this.t=t;
	}

	public void run(){
		
		t.printTable(5);
	}
}

class Mythreads1 extends Thread{

	table t;
	public Mythreads1(table t) {
		// TODO Auto-generated constructor stub
		this.t=t;
	}
	public void run(){
		t.printTable(100);
		
	}
	 
}

public class SYnchronizedMETHOD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
table t=new table();
Mythreadss mt=new Mythreadss(t);
Mythreads1 mt1=new Mythreads1(t);

mt.start();
mt1.start();
	}

}
