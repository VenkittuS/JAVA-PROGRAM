package CURSOR;

import java.util.Enumeration;
import java.util.Stack;

public class STackENumeration {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s=new Stack();
		
		s.push("venkittu");
		
		s.push("venky");
		s.push("payilagam");
		s.push(2333);
		s.isEmpty();
		
		Enumeration e=s.elements();
		
		e.nextElement();
		e.hasMoreElements();
		System.out.println(e.hasMoreElements());
		System.out.println(e.nextElement());
		
	}

}
