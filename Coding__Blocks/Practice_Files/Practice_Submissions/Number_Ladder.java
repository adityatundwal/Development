package Submissions_Practice;
import java.util.Scanner;

public class Number_Ladder{
	

	public static void main(String[] args){


	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int row = 1;
	int star = 1;
	int count = 1;

	while(row <= n){
		int i = 1;
		while(i <=  star){
			System.out.print(count+" ");
			i++;
			count++;
		}
		row++;
		System.out.println();
		star++;
	}
	}
}