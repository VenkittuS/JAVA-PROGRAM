package COLLECTIONS;

import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Stack s=new Stack();
		
		s.push("venkyyy");
		System.out.println(s.peek());
		s.push("payi");
		s.push("sajsj");
		System.out.println(s.isEmpty());
		s.pop();
		System.out.println("search"+s.search("payi"));
		System.out.println(s);
	}

}
