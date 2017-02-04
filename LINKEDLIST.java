package COLLECTIONS;

import java.util.LinkedList;

public class LINKEDLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList l=new LinkedList();
		l.add("venky");
		l.add(30);
		l.add(null);
		l.add("venksks");
		//l.set(0, "venkkaksk");
		l.add(0, "venkyyyyyy");
		System.out.println(l);
		l.removeLast();
		l.addFirst("first");
		System.out.println(l);
	}

}
