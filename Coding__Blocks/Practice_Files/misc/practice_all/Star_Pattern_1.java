package practice_all;
import java.util.Scanner;

public class Star_Pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;

		
		
		while(row<=n) {
			int i = 1;
			while(i<=n) {
				System.out.print("* ");
				i++;

			}
			row++;
			System.out.println();
		}

	}

}
