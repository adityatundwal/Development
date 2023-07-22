package practice_all;
import java.util.Scanner;

public class Star_Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int ast = 1;
		int count = 1;
		
		while(row<=n) {
			int i = 1;
			while(i <= star) {
				while(count<=n) {
					System.out.println(count+" ");
					count++;
					System.out.println();
					i++;
					
				}
			}
			row++;
			System.out.println();
		}

	}

}
