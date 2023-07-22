package Thorough_Practice_Pattern_Question;
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
		
		while(row<=n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			int k = 1;
			while(k <= space2) {
				System.out.print("  ");
				k++;
			}
			
			if (row <= n/2) {
				space++;
				space2-=2;
			}
			else {
				space--;
				space2+=2;
			}
			if (row!=n/2+1) {
				System.out.print("*");		
			}
			row++;
			System.out.println();
		}
		

	}

}
