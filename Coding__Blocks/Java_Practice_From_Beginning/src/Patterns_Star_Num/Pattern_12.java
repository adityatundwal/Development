package Patterns_Star_Num;

import java.util.Scanner;

public class Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k <= star) {
				if (k%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
				k++;
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}

	}

}
