package Practice_Pattern_Questions;
import java.util.Scanner;
public class Star_Pattern_Question_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;		
		while(row <= n) {
			int i = 1;
			while(i<=n) {  // to print 5*5 we need to compare the internal loop with n also
				System.out.print("* ");
				i++;
			}
			
			row++;
			System.out.println();
		}

	}

}
