package practice_all;
import java.util.Scanner;

public class Star_Pattern_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n-1;
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j =1;
			int count = 1; // count will be written before while loop always
			while(j <= star) {
				System.out.print(count+" ");
				if(j<(star/2)+1) {
					count++;
				}
				else {
					count--;
				}
				j++; //j++ will always be outside of if else 
			}
			star+=2;
			row++;
			space--;
			System.out.println();
		}

	}

}
