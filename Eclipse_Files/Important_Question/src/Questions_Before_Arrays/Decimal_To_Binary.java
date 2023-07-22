package Questions_Before_Arrays;

public class Decimal_To_Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 78;
		
		int sum = 0;
		
		int multiplier = 1;
		
		while(n>0) {
			int rem = n%2;
			sum = sum + rem * multiplier;
			multiplier = multiplier *10;
			n = n /2;
		}
		System.out.println(sum);
		
		

	}

}
