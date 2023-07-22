package Practice_Submission;
import java.util.Scanner;

public class Hollow_Diamond{
	public static void main(Stringp[] args){

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int row = 1;
		int star = n/2+1;
		int space = -1;

		while(row <= n){
			int i = 1;
			while(i <= star){
				System.out.print("*"+"\t");
				i++;
			}
			int j = 1;
			while(j <=  space){
				System.out.print(" "+"\t");
				j++;
			}

			int k = 1;
			if (row==1 || row ==n){
				k = 2; //to stop extra output
			}

			while(k <= star){
				System.out.print("*"+"\t");
				k++;
			}

			if (row<=n/2){
				star--;
				space+=2;
			}
			else{
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}
}