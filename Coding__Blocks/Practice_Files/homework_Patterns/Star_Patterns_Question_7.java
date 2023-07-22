package homework_Patterns;
import java.util.Scanner;

public class Star_Patterns_Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		int column = 1;
		
		
		while (row <= star) {
			if (row == 1 | row == n) {
				int i = 1;
				while(i <= star) {
					System.out.print("* ");
					i++;
				}
				
			}
			
			else if(row != 1 && row != n) {
				int j = 1;
				int k = 1;
				while(k <= column) {
					System.out.print("*");
					k++;
				}
				while (j<=column) {
					System.out.print("       *");
					j++;
				}
				
				
			}
			row++;
			System.out.println();
		}

	}

}
