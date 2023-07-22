package Patterns;
import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int space = 0;
		
		for(int row = 1; row<=n;) {
			for(int i = 0; i<space; i++) {
				System.out.print("  ");
			}
			
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			row++;
			space+=2;
			star--;
			System.out.println();
		}
		
		

	}

}
