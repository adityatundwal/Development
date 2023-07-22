package practice_all;
import java.util.Scanner;

public class Star_Pattern_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = n/2;
		int star = 1;
		int space2 = -1;
		
		while(row <= n) {
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
			int j = 1;
			while(j <= space2) {
				System.out.println("  ");
				j++;
			}
			
			int a = 1;
			while(a <= star) {
				System.out.print("* ");
				a++;
			}
			
			if (row <=n/2) {
				space--;
				space2+=2;

			}
			else {
				space++;
				space2-=2;

			}
			row++;
			System.out.println();
		}

	}

}
