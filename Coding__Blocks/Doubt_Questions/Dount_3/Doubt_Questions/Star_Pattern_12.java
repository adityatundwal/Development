package Doubt_Questions;
import java.util.Scanner;


public class Star_Pattern_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star =1;
		int space = n-1;
		
		while(row <= n) {
			int i = 1;
			while(i <= space) {
				System.out.print("  ");
				i++;
			}
			
			int k = 1;
			while(k <= star) {
				if (k%2==0){  //if incremental value is divisible by two
					System.out.print("! ");//we will print exclaimation for ex 2 24 etc
				}
				else {
					System.out.print("* "); //if it is not divisible by 2 then only we will print star
				}
				k++;
			}
			space--;
			star+=2;
			row++;
			System.out.println();
		}

	}

}
