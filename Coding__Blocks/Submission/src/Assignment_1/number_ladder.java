package Assignment_1;
import java.util.Scanner;

public class number_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 1;
		int count = 1;
		
		while(row<=n) {
			int i = 1;
			while(i<=star) {
				System.out.print(count+" ");
				count++;
				i++;
			}
			row++;
			System.out.println();
			star++;
		}
	}

}
