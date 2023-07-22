package Patterns_Star_Num;
import java.util.Scanner;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			int count = row; //always take count as row in this type of pattern
			while(k <= star) {
				System.out.print(count+" ");
				if (k<=star/2) {
					count++;
				}
				else {
					count--;
				}
				k++;
			}
			row++;
			space--;
			star+=2;
			System.out.println();
		}

	}

}
