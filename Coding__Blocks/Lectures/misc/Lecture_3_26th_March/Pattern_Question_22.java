package Lecture_3_26th_March;
import java.util.Scanner;
public class Pattern_Question_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		int space = -1;
		
		while(row<=n) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			if (row==1) {
				k = 2;
			}
			while(k <= star) {    //Most Importanta Part
				System.out.print("* ");
				k++;
			}
			System.out.println();
			row++;
			space +=2;
			star--;
		}

	}

}
