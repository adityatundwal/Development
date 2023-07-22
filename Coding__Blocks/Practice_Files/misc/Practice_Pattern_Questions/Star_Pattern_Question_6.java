package Practice_Pattern_Questions;
import java.util.Scanner;
public class Star_Pattern_Question_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;   //in some pattern you must take the value of star as an N	
		int space = 0;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			star--;
			space+=2;
		}

	}

}
