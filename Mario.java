import java.util.Scanner;

public class Mario {

	public static void main(String[] args) {
		
		System.out.println("Enter Height less than 23 ");
		Scanner scn=new Scanner(System.in);
		int height=scn.nextInt();
		while(height<0||height>23) {
			System.out.println("Enter Height less than 23 ");
			height=scn.nextInt();
		}
		for(int i=0;i<height;i++) {
			for(int j=height-1-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int k=height-i;k<=height+1;k++) {
				System.out.print("#");
			}
			System.out.println("");
		}
	}

}
