package Patterns;
import java.util.Scanner;

public class p9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		int space = n-1;
		
		for(int row = 1; row<=n;) {
			for(int i = 0; i<space; i++) {
				System.out.print("  ");
			}
			
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}
		
		

	}

}
