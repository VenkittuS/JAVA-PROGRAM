package pAYILAGAM;

public class TriangleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<3;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
				}
			for(int k=3;k>i;k--)
			{
				System.out.print("*");
			}
		System.out.println();
}
		for(int i=3;i>0;i--){
			for(int j=0;j<i;j++){
				System.out.print(" ");
				}
			for(int k=3;k>=i;k--)
			{
				System.out.print("*");
			}
		System.out.println();
}

	}

}
