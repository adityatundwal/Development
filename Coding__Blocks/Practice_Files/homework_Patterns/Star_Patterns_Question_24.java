package homework_Patterns;
import java.util.Scanner;

public class Star_Patterns_Question_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = n-1;
		int star = 1;
		int inc = 1;
		
		while (row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print(inc+" ");
				j++;
			}
			row++;
			System.out.println();
			space--;
			star+=2;
			inc++;
		}

	}

}
