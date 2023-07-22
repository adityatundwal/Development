package Lecture_2_3_patterns;
import java.util.Scanner;

public class pattern_1_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n;
		
		for(int row = 1; row<=n;) {
			for(int i = 1; i <= star; i++) {
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}

	}

}
