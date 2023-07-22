package Doubt_Questions;
import java.util.Scanner;

public class Star_Pattern_26 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = n-1;
		
		while(row<=n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			int count = 1;
			while(k <= star) {
				System.out.print(count+" ");
				count++;
				k++;
				
			}
			space--;
			star+=2;
			row++;
			System.out.println();
		}
		
	}

	}


