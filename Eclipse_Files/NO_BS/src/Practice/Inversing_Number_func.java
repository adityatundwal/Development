package Practice;

import java.util.Scanner;

public class Inversing_Number_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(Inverse(a));
		}
	
	
	public static int Inverse(int a) {
		int  sum  = 0;
		int position = 1;
		while(a>0) {
			int remainder = a%10;
			sum = (int) (sum+position*Math.pow(10, remainder-1));
			a=a/10;
			position++;
			}
		return sum;
	}

}
