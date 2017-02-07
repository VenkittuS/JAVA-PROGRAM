package CURSOR;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class ITERARTORS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList al=new ArrayList();
		
		al.add("venki");
		al.add("payilagam");
		al.add(344);
		al.add("dds");
		
		for(int i=0;i<10;i++){
			al.add(i);
			
		}
		System.out.println(al);
		
		/*LinkedList ll=new LinkedList();
		
		ll.addAll(al);
		ll.add("venksjsj");
		ll.add("dsd");
		ll.element();
		
		
		System.out.println(ll);*/
		
		/*Vector c=ne
	c.add("ved");
	
	c.add("ssss");
	System.out.println(c);*/
		Iterator  it= al.iterator();
		it.next();
		System.out.println(it.hasNext());
		
		
		System.out.println(it.next());
		
		
		
		while(it.hasNext()){
			
			System.out.println(it.next());
		}
		
		
	/*	
		if(it.hasNext()){
			System.out.println(it.next());
		}
		else {
			System.out.println(it.next());
		}*/
		
		
		int a=(Integer)it.next();
		if(a%3==0){
			it.remove();
			System.out.println("removed");
		}
	}
	

}
