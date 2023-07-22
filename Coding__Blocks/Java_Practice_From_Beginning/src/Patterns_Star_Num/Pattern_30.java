package Patterns_Star_Num;
import java.util.Scanner;

public class Pattern_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		
		while(row <= n) {
			
			int i = 1;
			int count = n;
			while(i <= star) {
				System.out.print(count+" ");
				count--;
				i++;
			}
			row++;
			System.out.println();
			
		}

	}

}
