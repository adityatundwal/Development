package Lecture_2_3_patterns;
import java.util.Scanner;

public class pattern_2_approach_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<= star) {
				System.out.print("* ");
				i++;
			}
			row++;
			star++;
			System.out.println();
		}

	}

}