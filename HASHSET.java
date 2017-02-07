package COLLECTIONS;

import java.util.HashSet;

public class HASHSET {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs=new HashSet();
		hs.add("venky");
		hs.add("colle");
		hs.add("ve");
		hs.add("");
		System.out.println(hs);
		System.out.println(hs.size());
		
		HashSet hs1=new HashSet();
		System.out.println(hs1);
		hs1.add(hs);
		hs1.add("fe");
		System.out.println(hs1);
	}

}
