package COLLECTIONS;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>  al=new ArrayList<String>();
		ArrayList<Integer> all=new ArrayList<Integer>();
		LinkedList ll=new LinkedList();
		al.add("A");
		all.add(40);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove("A");
		System.out.println(al);
		al.add(2, "HI");
		System.out.println(al);
		al.add("n");
		System.out.println(al);
		al.size();
		System.out.println(al+"size");
		al.contains("N");
		System.out.println(al.contains("N"));
		System.out.println(al.iterator());
		System.out.println(al.lastIndexOf("n"));
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
		
		
	}

}
