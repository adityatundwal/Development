package practice_all;
import java.util.Scanner;
public class Star_Pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int count = n;
		int space = n-1;
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k <= star) {
				System.out.print(count+" ");
				k++;
			}

			
			row++;
			space--;
			star+=2;
			System.out.println();
		}
	}

}
