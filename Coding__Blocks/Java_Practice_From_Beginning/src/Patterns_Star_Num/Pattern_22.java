package Patterns_Star_Num;
import java.util.Scanner;
public class Pattern_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		int space = -1;
		
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			int k = 1;
			while(k <= space) {
				System.out.print("  ");
				k++;
			}
			int j = 1;
			if (row==1) {
				j=2;
			}
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			row++;
			space+=2;
			star--;
		}

	}

}
