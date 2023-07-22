package Lecture_2_3_patterns;
import java.util.Scanner;


public class pattern_5_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = n;
		int space = 0;
		for(int row = 1; row<=n;) {
			for(int i = 1; i<=space;  i++) {
				System.out.print("  ");
			}
			for(int j = 1; j<=star; j++) {
				System.out.print("* ");
			}
			row++;
			star--;
			space++;
			System.out.println();
		}

	}

}
