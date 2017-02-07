package CURSOR;

import java.util.Enumeration;
import java.util.Vector;



public class ENUMERATION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Vector v=new Vector();
	v.add(113);
	v.add("null");
	v.add("hiii");
	v.add("venky");
	v.add("kkii");
	v.elements();
	
	
	Enumeration en=v.elements();
	
	
	en.nextElement();
	System.out.println(en.nextElement());
	System.out.println(en.hasMoreElements());
	
	
	while(en.hasMoreElements()){
		
		
		System.out.println(en.nextElement());
	}
	}
	
	
	

}
