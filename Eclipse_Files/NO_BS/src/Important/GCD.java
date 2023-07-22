package Important;
import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int divisor = sc.nextInt();   	//A number by given another number is to be divided
		int divident = sc.nextInt();	//Value divided by Divisor
		while(divident % divisor != 0) {
			int remainder = divident % divisor ;  // the value left after a number is divided 
			divident = divisor;
			divisor = remainder;
		}
		System.out.println(divisor);		//retuns the GCD / HCF
		

	}

}
