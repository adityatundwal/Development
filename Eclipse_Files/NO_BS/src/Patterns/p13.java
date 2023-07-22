package Patterns;
import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		
		for(int row = 1; row<=2*n-1;) {
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			if(row<n) {
				star++;
			}
			else {
				star--;
			}
			row++;
			System.out.println();
		}
		
		

	}

}
