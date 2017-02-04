package COLLECTIONS;

import java.util.Vector;

public class VECTOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Vector v=new Vector();
v.addElement("venky");
System.out.println(v.capacity());
for(int i=0;i<10;i++){
	v.addElement(i);
}
System.out.println(v.capacity());
v.addElement("vee");
System.out.println(v.capacity());


	}

}
