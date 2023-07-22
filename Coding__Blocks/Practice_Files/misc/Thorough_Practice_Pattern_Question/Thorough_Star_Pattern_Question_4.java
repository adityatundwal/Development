package Thorough_Practice_Pattern_Question;
import java.util.Scanner;

public class Thorough_Star_Pattern_Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = 1;
		
		while(row<=n) {
			
			int i = 1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			
			
			int k = 1;
			while(k<=n-1) {
				System.out.print("  ");
				k++;
			}

			row++;
			star++;
			space--;
			System.out.println();
		}

	}

}
