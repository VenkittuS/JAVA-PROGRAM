package pAYILAGAM;

public class Synctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Thread t = new Thread() 
		        {
		            Foo f = new Foo();
		            public void run() 
		            {
		                f.increase(20);
		            }
		        };
		    t.start();
		    }
		}
		class Foo 
		{
		    private int data = 23;
		    public void increase(int amt) 
		    {
		        int x = data;
		        data = x + amt;
		    }
		


}
