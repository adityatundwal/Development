package Assignment_1;
import java.util.Scanner;

public class Hollow_Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row =  1;
		int star = n/2+1;
		int space = -1;
		
		while(row<=n) {
			int i = 1;
			while(i <= star) {
				System.out.print("*");
				i++;
			}
			int k = 1;
			while(k <= space) {
				System.out.println(" ");
				k++;
			}
			
			int j = 1;
			while(j<=star) {
				System.out.print("*");
				j++;
			}
			if (row<=n/2) {
				star--;
				space++;
			}
			else {
				star++;
				space--;
			}
				
			row++;
			System.out.println();
		}
		

	}

}
