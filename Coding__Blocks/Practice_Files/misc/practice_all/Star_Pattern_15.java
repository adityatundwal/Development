package practice_all;
import java.util.Scanner;
public class Star_Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row <= 2*n-1) {
			
			int k =  1;
			while(k <= space) {
				System.out.print("  ");
				k++;
			}
			
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			
			if (row<n) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
		
	}

}
