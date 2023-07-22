package Assignment_1;
import java.util.Scanner;

public class hollow_rohumbus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space1 = n-1;
		int space2 = n-2;
		
		while(row<=n) {
			int i = 1;
			while(i<=space1) {
				System.out.print("  ");
				i++;
			}
			if(row==1|| row ==n) {
				int k = 1;
				while(k<n) {
					System.out.print("* ");
					k++;
				}
			}
			else {
				System.out.print("* ");
				int j = 1;
				while(j<=space2) {
					System.out.print("  ");
					j++;
				}
			}
			System.out.print("*");
			space1--;
			row++;
			System.out.println();
		}

	}

}
