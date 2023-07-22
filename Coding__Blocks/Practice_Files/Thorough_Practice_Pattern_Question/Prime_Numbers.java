package Thorough_Practice_Pattern_Question;
import java.util.Scanner;

public class Prime_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 2; i<=n; i++) {
			int num = i;
				if(num%2!=0 && num%3!=0 && num%7!=0 && num%5!=0 && num%11!=0) {
					System.out.println(num);
				}
			}
			
			
		}

	}


