package Lecture_2_3_patterns;
import java.util.Scanner;


public class pattern_6_approach_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row<=n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			space+=2;
			star--;
			System.out.println();
		}

	}

}
