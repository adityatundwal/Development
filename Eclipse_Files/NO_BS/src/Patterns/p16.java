package Patterns;
import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub4
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-1;
		int star = n;
		
		for(int row = 1; row<2*n;) {
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= star; j++) {
				System.out.print("* ");
			}
			
			if(row<n) {
				space--;
				star--;
			}
			else {
				star++;
				space++;
			}
			row++;
			System.out.println();
		}
	}

}
