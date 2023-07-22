package Patterns;
import java.util.Scanner;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = n-2;
		
		for(int row = 1; row<=n;) {
			if(row == 1 || row == n) {
				for(int i = 1; i<=n; i++) {
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
				for(int j = 1; j <= space; j++) {
					System.out.print("  ");
				}
				System.out.print("*");
			}	
			row++;
			System.out.println();
		}		
	}

}
