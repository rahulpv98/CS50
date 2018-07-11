import java.util.Scanner;

public class Cash {

	public static void main(String[] args) {
		int bal;
		int coin=0;
		System.out.println("Enter balance ");
		Scanner scn=new Scanner(System.in);
		float f=scn.nextFloat();
		while(f<0) {
			System.out.println("Enter balance greater than 0 ");
			f=scn.nextFloat();
		}
		bal=(int) (f*100);
		while(bal>=25){
	        bal=bal-25;
	        coin++;
	    }
	    while(bal>=10){
	        bal=bal-10;
	        coin++;
	    }
	    while(bal>=5){
	        bal=bal-5;
	        coin++;

	    }
	    while(bal>=1){
	        bal=bal-1;
	        coin++;
	    }
	    System.out.println(coin);
	}
	

}
