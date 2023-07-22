package Practice_Pattern_Questions;
import java.util.Scanner;

public class Star_Patten_Question_7_Hollow_Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = n;
		int space = n-2;
		
		while(row <= n) {
			if (row == 1 || row == n) {
				int i = 1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
			}
			else if (row != 1 || row != n) {
				int k = 1;
				while(k <= space) {
					System.out.print("*       ");
					k++;
				}
			}
			
			row++;
			System.out.println();
		}
		
		
		}
		
		
	

}

