package Important;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int one = 0;
		int two = 1;
		int iterator = 1;
		while(iterator<=n) {
			int temperory = one+two;
			one = two;
			two = temperory;
			iterator++;
		}
		System.out.println(one);
		
		

	}

}
