package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collection {



	public static void main(String args[]){
		ArrayList al = new ArrayList();
		
		for(int i=0 ; i <= 20 ; i++)
		{
			
			al.add(""+i);
			
		}
		
		
		
		System.out.println("Arraylsttt");

		for(int i=0 ; i <= al.size()-1 ; i++)
		{
			System.out.println("alist..."+i);
			System.out.println(al.get(i));
			
		}
		
		for(int i=0 ; i <= al.size()-1 ; i++)
		{
		System.out.println("hmap..."+i);
		HashMap hmap = new HashMap();
		hmap.put(i ,al.get(i));
		hmap.
		System.out.println(hmap.get(i));
		}
		
		
		
		
		
	}
}
