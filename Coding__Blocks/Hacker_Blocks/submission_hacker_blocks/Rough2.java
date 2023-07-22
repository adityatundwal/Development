package submission_hacker_blocks;
import java.util.Scanner;
public class Rough2 {
	
    public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		
		
		while(row <= n) {
			int i = 1;
			int count = 1;
			while(i <= star) {
				System.out.print(count+"\t");
				if(i<(star/2)+1) {
					count++;
				}
				else {
					count--;
				}
				i++;
			}
			star+=2;
			row++;
			System.out.println();
		}

	}
}