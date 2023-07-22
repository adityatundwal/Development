package Series;
import java.util.Scanner;

public class Bin_to_Dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int sum = 0;
		int multiplier = 1;
		
		while(n>0) {
			int rem = n%10;  //here we are dividing the value by 10
			sum = sum+rem+multiplier;
			multiplier = multiplier * 2; // here we are multiplying to convert the result from binary to Dec
			n = n/10;
		}
		System.out.println(sum);

	}

}
