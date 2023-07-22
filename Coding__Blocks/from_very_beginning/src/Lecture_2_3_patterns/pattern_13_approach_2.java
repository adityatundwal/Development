package Lecture_2_3_patterns;
import java.util.Iterator;
import java.util.Scanner;


public class pattern_13_approach_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = 1;
		
		for(int row = 1; row<=2*n-1; ) {
			for(int i = 1; i<=star; i++) {
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
