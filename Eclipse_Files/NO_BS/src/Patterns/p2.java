package Patterns;
import java.util.Scanner;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = 1;
		
		for(int row = 1; row<=n;) {
			for(int i = 0; i<star; i++) {
				System.out.print("* ");
			}
			row++;
			star++;
			System.out.println();
		}
		
		

	}

}
