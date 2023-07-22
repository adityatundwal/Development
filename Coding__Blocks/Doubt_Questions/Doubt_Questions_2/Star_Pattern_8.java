package Doubt_Questions;
import java.util.Scanner;
public class Star_Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = 0;
		int space2 = n-2;
		
		while(row <= n) {
			
			int k = 1;
			while(k<=space) {
				System.out.print("  ");
				k++;
				}
			
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j<=space2) {
				System.out.print("  ");
				j++;
			}
			
			
			if (row<n-2) {
				space++;
				space2-=2;
				System.out.print("* ");

			}
			else {
				space--;
				space2+=2;
				System.out.print("* ");

			}

			row++;
			System.out.println();
		}

	}

}
