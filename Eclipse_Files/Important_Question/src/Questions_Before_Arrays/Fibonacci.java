package Questions_Before_Arrays;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int a = 0;
		int b = 1;
		
		for (int i = 0; i < n; i++) {
			int c = a+b;
			a=b;
			b=c;
			i++;
			System.out.println(c+" ");
		}

	}

}
