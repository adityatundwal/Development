package Lecture_3_26th_March;
import java.util.Scanner;

public class Mirror_Pattern_Question13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		
		while (row <= 2*n-1) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			if (row<n) {
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
