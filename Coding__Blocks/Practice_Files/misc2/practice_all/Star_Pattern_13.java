package practice_all;
import java.util.Scanner;

public class Star_Pattern_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		
		while(row<= 2*n-1) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			
			if (row < n) { //Always take n value here
				star++;
			}
			else {
				star--;
			}
			row++;
			System.out.println();
		}


	}

}
