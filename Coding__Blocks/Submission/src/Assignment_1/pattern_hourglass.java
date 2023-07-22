package Assignment_1;
import java.util.Scanner;


public class pattern_hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int row = 1;
		int star = 2*n+1;
		int space = 0;
		int num = n;
		
		while(row<=2*n+1) {
			int i = 1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int k = 1;
			int count = num;
			
			while(k<=star) {
				System.out.print(count+" ");
				if (k<=star/2) {
					count--;
				}
				else {
					count++;
				}
				k++;
			}
			if(row<=n) {
				star-=2;
				space++;
				num--;
			}
			else {
				star+=2;
				space--;
				num++;
			}
			row++;
			System.out.println();
		}
	}

}
