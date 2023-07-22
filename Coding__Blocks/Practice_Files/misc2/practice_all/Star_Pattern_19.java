package practice_all;
import java.util.Scanner;
public class Star_Pattern_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n/2+1;   // We took star n/2 plus 1 because to return the exact value of star until n
		int space = 0;
		
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
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			if (row <= n/2) {
				space+=2;
				star--;
			
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
