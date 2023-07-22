package Thorough_Practice_Pattern_Question;
import java.util.Scanner;

public class Thorough_Practice_Pattern_Question_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = n;
		int space = 1;
		
		while(row<=n) {
			if(row ==1) {
				int i = 1;
				while(i<=n) {
					System.out.print("* ");
					i++;
					}
			}else if(row ==n) {
				int j = 1;
				while(j<=n) {
					System.out.print("* ");
					j++;
				}
				
			row++;
			System.out.println();
		}
		
		
		
	
	
	}			
	
	}}
	