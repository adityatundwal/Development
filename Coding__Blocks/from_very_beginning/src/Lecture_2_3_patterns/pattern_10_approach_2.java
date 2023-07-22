package Lecture_2_3_patterns;
import java.util.Scanner;


public class pattern_10_approach_2 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = 0;
		int star = 2*n-1;
		
		for(int row = 1; row<=n;) {
			for(int i = 1; i<=space; i++) {
				System.out.print("  ");
			}
			for(int j = 1; j<= star; j++) {
				System.out.print("* ");
			}
			row++;
			System.out.println();
			space++;
			star-=2;
		}
	}

}
