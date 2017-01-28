package BAsiC;
import java.util.Scanner;

public class AreaOFCircle {
//A=pi r.r
	double pi=3.14;
	String name = "Circle";
	

	@Override
	public String toString() {
		return "AreaOFCircle [pi=" + pi + ", name=" + name + "]";
	}

	void cicrle(){
		Scanner obj=new Scanner(System.in);
		System.out.println("enter radius");
		int r=(int)obj.nextFloat();
		double A=pi*r*r;
		System.out.println(A);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AreaOFCircle aoc=new AreaOFCircle();
System.out.println(aoc);
aoc.toString();
aoc.cicrle();

	}

}
