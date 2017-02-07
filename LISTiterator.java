package CURSOR;

import java.util.ArrayList;
import java.util.ListIterator;

public class LISTiterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList();
al.add("venk");
al.add("ddd");
al.add("add");
al.add("ffg");
  ListIterator li=al.listIterator();
  System.out.println(li.next());
  System.out.println(li.hasNext());
  System.out.println(li.hashCode());
  System.out.println(li.previous());
  System.out.println(li.hasPrevious());
li.add("veev");
System.out.println(li);
	}

}
