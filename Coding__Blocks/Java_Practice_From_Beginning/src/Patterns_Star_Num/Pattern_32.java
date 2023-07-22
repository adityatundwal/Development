package Patterns_Star_Num;
import java.util.Scanner;


public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int count = 1;
		
		while(row<=2*n-1) {
			int i = 1;
			while(i <= star) {
				if (i%2==0) {
					System.out.print("* ");
				}
				else {
					System.out.print(count+" ");
				}
				i++;
			}
			if (row<n) {
				star+=2;
				count++;
			}
			else {
				star-=2;
				count--;
			}
			row++;
			System.out.println();
		}

	}

}
