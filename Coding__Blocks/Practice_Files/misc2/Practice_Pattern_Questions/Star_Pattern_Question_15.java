package Practice_Pattern_Questions;
import java.util.Scanner;

public class Star_Pattern_Question_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = 0;
		int star = n;
		
		while(row <= 2*n-1) {
			int k = 1;
			while(k<=space) {
				System.out.print("  ");
				k++;
			}
			
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			
			if  (row<n) {
				star--;
				space+=2;
			}
			else {
				space-=2;
				star++;
			}
			row++;
			System.out.println();
		}
		
	}

}
