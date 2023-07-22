package Patterns_Star_Num;
import java.util.Scanner;
public class Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int space = n-1;
		int star = 1;
		int space2 = -1;
		
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			if (row==1 | row == n) {
				k=2;
			}
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			int j = 1;
			while(j <= space2) {
				System.out.print("  ");
				j++;
			}
			System.out.print("* ");
			
			if (row< n/2+1) {
				space2+=2;
				space--;
			}
			else {
				space2-=2;
				space++;
			}
			row++;
			System.out.println();
			
		}
		

	}

}
