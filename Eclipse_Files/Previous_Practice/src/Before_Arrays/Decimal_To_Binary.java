package Before_Arrays;

import java.util.Scanner;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int sum = 0;
		int mult = 1;
		
		
		while(n>0) {
			int rem = n%2;
			sum+=rem*mult;
			mult *=10;
			n/=2;
		}
		
		System.out.println(sum);

	}

}
