package Before_Arrays;

import java.util.Scanner;

public class Binary_TO_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int sum = 0;
		int mult = 1;
		
		while(n>0) {
			int rem = n%10;
			sum += rem*mult;
			mult*=2;
			n/=10;
		}
		System.out.println(sum);

	}

}
