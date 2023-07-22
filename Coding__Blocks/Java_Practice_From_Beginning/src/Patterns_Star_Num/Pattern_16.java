package Patterns_Star_Num;
import java.util.Scanner;

public class Pattern_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = n-1;
		int star = n;
		
		
		while(row <= 2*n-1) {
			int i = 1;
			while(i <=  space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row<n) {
				space--;
				star--;
			}
			else {
				space++;
				star++;
				
			}
			row++;
			System.out.println();
		}

	}

}
