package homework_Patterns;
import java.util.Scanner;

public class Pattern_27_Practice {

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
			int count = 1;
			while(k <= star) {
				System.out.print(count+" ");
				
				if (k<(star/2)-1) {
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
