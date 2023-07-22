package practice_all;
import java.util.Scanner;


public class Star_Pattern_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		int space = 1;
		
		while(row <= n) {
			
			int k = 1;
			while(k <= space){
				System.out.print("  ");
				k++;
			}
			
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			row++;
			space++;
			star--;
			
			System.out.println();
		}
		

	}

}
