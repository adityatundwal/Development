package homework_Patterns;
import java.util.Scanner;
public class Star_Patterns_Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		
		int row = 1;
		int space = n-1;
		int star = 1;
		
		
		
		//Space
		while(row <= n) {   //Remember to keep everything under this loop
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			//Star
			
			int j = 1;
			while(j <= star) {
				System.out.print("* ");
				j++;
			}
			
			//Next Line Prep
			row++;
			System.out.println();
			space--;
			star++;
		}
	}
	//The Error which was occuring because you put the other while loop and incrementing values outside the first loop

}
