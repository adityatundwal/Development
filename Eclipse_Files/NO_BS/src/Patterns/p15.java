package Patterns;
import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		int space = 0;
		
		for(int row = 1; row<=2*n-1;) {
			for(int i = 0; i<space; i++) {
				System.out.print("  ");
			}
			
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			
			if(row<n) {
				space+=2;
				star--;
			}
			else {
				space-=2;
				star++;
			}
			row++;

			System.out.println();
		}
		
		

	}

}
