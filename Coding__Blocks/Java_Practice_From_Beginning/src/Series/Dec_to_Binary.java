package Series;
import java.util.Scanner;
public class Dec_to_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int multiplier = 1;
		
		while(n>0) {
			int rem = n%2;
			sum = sum+rem*multiplier;
			multiplier = multiplier*10;
			n = n/2;
		}
		
		System.out.println(sum);
		
		

	}

}
