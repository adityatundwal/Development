package Assignment_1;
import java.util.Scanner;
public class pattern_number_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int space = n-1;
		int star = 1;
		
		
		while(row<=n) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j = 1;
			int count = row;
			while(j<=star) {
				System.out.print(count +" ");
				
				if(j<=star/2) {
					count++;
				}
				else {
					count--;
				}
				j++;
				
				
			}
			space--;
			row++;
			System.out.println();
			star+=2;
		}

	}

}
