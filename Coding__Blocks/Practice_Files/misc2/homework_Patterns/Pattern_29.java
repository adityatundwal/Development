package homework_Patterns;
import java.util.Scanner;

public class Pattern_29 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		int space = n-1;
		int count = 1;
		
		while(row<=n){
			
			int i = 1;
			while(i <= space){
				System.out.print("  ");
				i++;
			}
			int k = 1;
			while(k<=star){
				System.out.print(count+" ");
				k++;
			}
			if (k == 1  || k == i) {
				count++;
			}
			else {
				System.out.print("0 ");
				
			}
			
			row++;
			System.out.println();
			star+=2;
			space--;
			
		}

}}
