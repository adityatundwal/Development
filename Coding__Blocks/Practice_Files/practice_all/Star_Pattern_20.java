package practice_all;
import java.util.Scanner;

public class Star_Pattern_20 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int row = 1;
		int space = n-1;
		int space2 = -1;
		int star = 1;
		
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			if (row==1 || row==n) {
				j=2;
			}
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			int k = 1;
			while(k <= space2) {
				System.out.print("  ");
				k++;
			}
			System.out.print("* ");
			
			if (row < n/2+1) {
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
