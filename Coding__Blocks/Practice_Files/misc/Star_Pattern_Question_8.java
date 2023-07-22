import java.util.Scanner;
public class Star_Pattern_Question_8 {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int space = 0;
		
		while (row <= n) {

			int k = 1;
			while(k <= star) {
				System.out.print("*  ");
				k++;
			}
			
			int j = 1;
			while(j <= space) {
				System.out.print("   ");
				j++;
			}
			
			int i = 1;
			while(i<= star) {
				System.out.print(" *");
				i++;
			}
			row++;
			System.out.println();
			space++;
			
			
		}
		
		

	}


}