package Lecture_2_3_patterns;
import java.util.Scanner;

public class pattern_12_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int space = n-1;
		int star = 1;
		
		for(int row = 1; row<=n;) {
			for(int i = 1; i <= space; i++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= star; j++) {
				if(j%2==0) {
					System.out.print("! ");
				}
				else {
					System.out.print("* ");
				}
			}
			row++;
			star+=2;
			space--;
			System.out.println();
		}

	}

}
