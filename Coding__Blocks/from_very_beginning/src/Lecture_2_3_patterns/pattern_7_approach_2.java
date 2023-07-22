package Lecture_2_3_patterns;
import java.util.Scanner;

public class pattern_7_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = 1;
		
		for(int row = 1; row<=n;) {
			if(row==1 || row == n) {
				for(int i = 1; i<=n; i++) {
					System.out.print("* ");
				}
			}
			else {
				System.out.print("* ");
				for(int i = 1; i<=n-2;i++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}

	}

}
