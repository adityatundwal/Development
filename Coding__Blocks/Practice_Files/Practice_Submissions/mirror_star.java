package Submissions_Practice;
import java.util.Scanner;

public class Mirror_Star_Pattern{
	

	public static void main(String[]  args){


	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();

	int row = 1;
	int star = 1;
	int space = n-1;


	while(row<=n){
		int i = 1;
		while(i <= space){
			System.out.print(" ");
			i++;
		}
		int k = 1;
		while(k <= star){
			System.out.print("* ");
			k++;
		}

		if (row< n/2+1){
			num+=2;
			space--;
		}
		else{
			num -=2;
			space++;
		}
		row++;
		System.out.println();
	}
	}
}