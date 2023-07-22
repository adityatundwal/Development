package homework_Patterns;
import java.util.Scanner;

public class Star_Pattern_Question_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		
		while(row<=n) {
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
			star++;
			
			}
		while (row>=n) {
			int j = 1;
			while(j>=star) {
				System.out.print("* ");
				j--;
				}
			
			}
		row--;
		System.out.println();
		star--;
		
	
		
	
	}

	}


