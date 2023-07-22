package submission_hacker_blocks;
import java.util.Scanner;

public class Check_Prime{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 2;
		int count = 0;

		while(i < n){
			if (n%i==0){
				count++;
			}
			i++;

			if (count == 0){
				System.out.print("Prime");
			}
			else{
				System.out.print("Not Prime")
			}
		}
	}
}