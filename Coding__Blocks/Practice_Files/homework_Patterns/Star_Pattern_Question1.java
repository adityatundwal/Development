package homework_Patterns;
import java.util.Scanner;

public class Star_Pattern_Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   //Declared the input function
		int n = sc.nextInt();         		//Took input of n
		
		int row = 1;						//initialized row 
		while(row<=n) {						//While Row is less than given input return *
			
			int i = 1;
			while(i <= n) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}

	}

}
