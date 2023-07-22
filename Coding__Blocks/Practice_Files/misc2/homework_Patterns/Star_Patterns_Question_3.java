package homework_Patterns;
import java.util.Scanner;

public class Star_Patterns_Question_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int star = n;
		int row = 1;
		
		while(row <= n) {      				//While Row is less than given input
			int i = 1;
			while(i <= star) {				//While i is less than given star
				System.out.print("* ");			
				i++;			
			}
			
			row++;
			System.out.println();
			star--;			//decrease the value of star every time the code is ran through loop
		}
		
		
		

	}

}
