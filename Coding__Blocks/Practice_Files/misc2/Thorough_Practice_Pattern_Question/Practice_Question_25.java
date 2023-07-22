package Thorough_Practice_Pattern_Question;
import java.util.Scanner;


public class Practice_Question_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		
		int row = 1;
		int space= n-1;
		int count = 1;
		int star = 1;
		
		while(row<=n) {
			
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
				
			}
			int i = 1;
			while(i<=star) {
				System.out.print(count+" ");
				count++;
				i++;
			}
			row++;
			System.out.println();
			star+=2;
			space--;

		}

	}

}
