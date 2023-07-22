package practice_all;
import java.util.Scanner;


public class Star_Pattern_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = n-1;
		int star = 1;
		
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			int count=1;
			while(k <= star) {
				if (k%k==0) {
					System.out.print("0 ");

					
				}
				else {
					System.out.print(count+" ");

				}
				k++;
			}
			count++;
			row++;
			System.out.println();
			star+=2;
			space--;
		}
	}

}
