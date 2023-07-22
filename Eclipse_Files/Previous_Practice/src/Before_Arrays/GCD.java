package Before_Arrays;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divisor");
		int divisor = sc.nextInt();
		System.out.println("Enter Divident");
		int divident = sc.nextInt();
		
		while(divisor%divident!=0) {
			int remainder = divident%divisor;
			divident = divisor;
			divisor = remainder;
		}
		
		System.out.println(divisor);
		
		
		

	}

}
