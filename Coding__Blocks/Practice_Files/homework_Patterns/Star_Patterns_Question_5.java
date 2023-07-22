package homework_Patterns;
import java.util.Scanner;
public class Star_Patterns_Question_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		int space = 0;
		
		
		//Space
		while (row <= n) {
			int i = 1;
			while(i <= space) {   //Remember always use i to compare space
				System.out.print("  ");
				i++;
			}
			int j = 1;
			while (j <= star) {   //Remember always use j to compare star
				System.out.print("* ");
				j++;
			}
			row++;
			System.out.println();
			space++;
			star--;
			
		}

	}

}
