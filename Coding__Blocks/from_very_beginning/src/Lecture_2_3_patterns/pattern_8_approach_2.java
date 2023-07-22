package Lecture_2_3_patterns;
import java.util.Scanner;

public class pattern_8_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int space = 1;
		int space2 = n-2;
		int star = 1;
		
		for(int row = 1; row<=n;) {
			for(int k = 1; k<=space; k++) {
				System.out.print("  ");
			}
			for(int i = 1; i<=star; i++) {
				System.out.print("* ");
			}
			for(int j = 1; j<=space2; j++) {
				System.out.print("  ");
			}
			if(row<n-2) {
				space++;
				space2-=2;
				System.out.print("* ");
			}
			else {
				space--;
				space2+=2;
				System.out.print("* ");
			}
			row++;
			System.out.println();
		}

	}

}
