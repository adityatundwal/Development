package Patterns_Star_Num;
import java.util.Scanner;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row <= 2*n-1) {
			int i = 1;
			while(i <= space) {
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
				star+=2;
			}
			else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();
		}

	}

}
