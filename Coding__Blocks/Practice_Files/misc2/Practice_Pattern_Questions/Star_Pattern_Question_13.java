package Practice_Pattern_Questions;
import java.util.Scanner;
public class Star_Pattern_Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		
		while(row <= 2*n-1) {  //We have taken 2*n-1 because we need that much rows to print the pattern both increasingly and decreasingly
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
				
				if (row < n) {
					star--;			}
				else {
					star++;
				}
			}
			
			
			row++;
			System.out.println();	
			star++;
			
		}

	}

}
