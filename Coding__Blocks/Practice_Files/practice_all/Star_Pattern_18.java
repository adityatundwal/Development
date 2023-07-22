package practice_all;
import java.util.Scanner;


public class Star_Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int space = n/2;
		int star = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			
			int k = 1;
			while(k <= star) {
				System.out.print("* ");
				k++;
			}
			
			if (row <= n/2) {
				space--;
				star+=2;
				
			}
			else {
				space++;
				star-=2;
			}
			row++;
			System.out.println();
			
		}

	}

}
