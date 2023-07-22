package Day_1;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 0; i < n; i++) {
			int temp = n1+n2;
			System.out.println(temp);
			n1 = n2;
			n2 = temp;
		}

	}

}
