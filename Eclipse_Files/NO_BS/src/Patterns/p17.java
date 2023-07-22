package Patterns;
import java.util.Scanner;
public class p17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int star = n/2;
		int space = 1;
		for(int row = 1; row<=n;) {
			for(int i = 1; i<=star; i++) {
				System.out.print("* ");
			}
			for(int j = 1; j <= space; j++) {
				System.out.print("  ");
			}
			for(int i = 1; i<=star; i++) {
				System.out.print("* ");
			}
			if(row<=n/2) {
				space+=2;
				star--;
			}
			else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
			
			
		}
		
		

	}

}
