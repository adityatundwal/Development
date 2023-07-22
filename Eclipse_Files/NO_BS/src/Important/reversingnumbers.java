package Important;
import java.util.Scanner;
public class reversingnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		
		while(n!=0) {
			int rem = n%10;  // removing the last digit
			sum = sum*10+rem;  // putting it in the front
			n = n/10;    //doing the same
		}
		System.out.print(sum);

	}

}
