package Questions_Before_Arrays;

public class Bin_To_dec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 10101011;
		
		int sum = 0;
		int mult = 1;
		
		
		while(n!=0) {
			int rem = n%10;
			sum = sum+rem*mult;
			mult = mult*2;
			n = n/10;
		}
		
		System.out.println(sum);

	}

}
