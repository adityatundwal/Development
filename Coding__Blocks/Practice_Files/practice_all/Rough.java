package practice_all;
import java.util.Scanner;
public class Rough {
 	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// initial
		int n = sc.nextInt();
		int row = 1;
		int star = 5;
		int space = 0;
		int a = n;
		while (row <= 2 * n + 1) {
			// space
			int i = 1;
			while (i <= space) {
				System.out.print("\t");
				i++;
			}
			// star
			int j = 1;
			int var = a;
			while (j <= star) {
				System.out.print(var +"\t");
				j++;
				var--;
			}
			// 0
			System.out.print(" 0 "+"\t");
			// star
			int k = 1;
			int var2 = 1;
			while (k <= star) {
				System.out.print(var2 + "\t");
				k++;
				var2++;
			}

			// mirror
			if (row <= n) {
				star--;
				space++;
				a--;
			} else {
				star++;
				space--;
				a++;
			}
			row++;
			System.out.println();
		}

	}
}