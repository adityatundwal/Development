package submission_hacker_blocks;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		
		Scanner sc = new Scanner(System.in);  

		int x = sc.nextInt();
		int y = sc.nextInt();
		int i = x;

		
		
		
		while(i <= x*y) {
			System.out.println(i);
			i = i+x;
		}
		
		
		
		
	

	}

}
