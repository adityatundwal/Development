package Practice_Pattern_Questions;
import java.util.Scanner;

public class Star_Pattern_Question_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n/2;
		int space = 1;
		
		while(row<=n) { //we took row <=n because the input is 7 
			
			int i = 1;
			while(i<= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while(j <= space) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			while(k<= star) {
				System.out.print("* ");
				k++;
			}
			
			if (row<=n/2) {
				star--;
				space+=2;
			}
			else {
				star++;
				space-=2;
			}
			
			System.out.println();
			row++;

		}
		

	}

}
