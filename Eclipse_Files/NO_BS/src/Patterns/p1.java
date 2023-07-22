package Patterns;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int row = 0;row<n;) {
			for(int i = 0; i<n; i++) {
				System.out.print("* ");
			}
			System.out.println();
			row++;
		}

	}

}
