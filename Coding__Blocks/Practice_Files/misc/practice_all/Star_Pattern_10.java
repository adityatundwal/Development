package practice_all;
import java.util.Scanner;

public class Star_Pattern_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 2*n-1;
		int space = 0;
		
		while(row <= n) {
			
			int k = 1;
			while(k <= space) {
				System.out.print("  ");
				k++;
			} 
			
			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			
			
			row++;
			space++;
			star-=2;
			System.out.println();
		}

	}

}
