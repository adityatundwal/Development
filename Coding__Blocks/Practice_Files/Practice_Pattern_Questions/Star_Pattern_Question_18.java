package Practice_Pattern_Questions;
import java.util.Scanner;

public class Star_Pattern_Question_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n/2;
		
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
			while(k <= space) {
				System.out.print("  ");
				k++;
			}
			
			if (row <= n/2) { //always remeber to take n/2 here because of incremential and decremential
				space--;
				star+=2;
			}
			else {
				space++;
				star-=2;
			}
			row++;
			System.out.println();
		}
	}

}
