package practice_all;
import java.util.Scanner;
public class Star_Pattern_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		int space = 0;
		
		while(row <= n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			row++;
			space+=2;
			star--;
			System.out.println();
		}

	}

}
