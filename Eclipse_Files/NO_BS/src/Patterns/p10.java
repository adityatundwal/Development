package Patterns;
import java.util.Scanner;

public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 2*n-1;
		int space = 0;
		
		for(int row = 1; row<=n;) {
			for(int i = 0; i<space; i++) {
				System.out.print("  ");
			}
			
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			row++;
			space++;
			star-=2;
			System.out.println();
		}
		
		

	}

}
