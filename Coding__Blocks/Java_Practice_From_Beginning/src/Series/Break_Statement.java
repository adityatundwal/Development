package Series;
import java.util.Scanner;

public class Break_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if (n%2==0) {
				count++;
				break;
			}
			i++;
		}
		if (count == 0) {
			System.out.print(" Prime ");
		}
		else {
			System.out.print(" Not Prime");
		}

	}

}
