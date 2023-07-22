package Thorough_Practice_Pattern_Question;

import java.util.Scanner;

public class Practice_Question_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		int count = 1;
		int inc = 1;
		
		while( row <= n) {
			while(star<=n) {
				int j = 1;
				while(j<=star) {
					System.out.print(count + " ");
					count++;
					j++;
					star++;

				}
			
			row++;
			System.out.println();
			
			}
	}

}
}