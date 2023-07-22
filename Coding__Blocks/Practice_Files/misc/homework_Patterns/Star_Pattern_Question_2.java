package homework_Patterns;
import java.util.Scanner;

public class Star_Pattern_Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		int row = 1;
		int star = 1;
		
		while (row <= n) {
			int i = 1;
			while(i <= star) {  //while i is less than given star value it will print asterisk
				System.out.print("* ");
				i++;
			}
			row++;					//Incrementing the row  value
			System.out.println();		//giving blank Row
			star++;						//Incrementing Star value to it takes it adds up new stars as long as we want
			
			
		}
		
	}

}
