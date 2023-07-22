package Submission_Hacker_Blocks_Practice;
import java.util.Scanner;


public class Checking_Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if(n%2==0) {
				count++;
			}
			i++;
		}
		
		if (count==0) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not Prime");
		}
		
		
		

	}

}
