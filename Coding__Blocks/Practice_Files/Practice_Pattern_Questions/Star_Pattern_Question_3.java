package Practice_Pattern_Questions;
import java.util.Scanner;

public class Star_Pattern_Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		
		while(row <= n) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
			star--;
		}

	}

}
