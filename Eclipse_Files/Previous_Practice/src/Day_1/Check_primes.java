package Day_1;

import java.util.Scanner;

public class Check_primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		System.out.println(checkprime(n));
	}

	private static boolean checkprime(int n) {
		// TODO Auto-generated method stub
		
		if(n<=1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	
		
	}
	

}
