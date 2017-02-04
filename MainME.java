package THREADD;

public class MainME {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Myrunnable mr=new Myrunnable();
Thread t=new Thread(mr);
t.start();
	}

}
