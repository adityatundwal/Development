package Assignment_1;
import java.util.Scanner;

public class Table_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Help Lakshya Bhaiya recite tables of an input number x to the limit x*y.

		//Print the table of x from x*1, x * 2, x * 3… x * y.

		//Input Format
		//Take two inputs, x and y

		//Constraints
		//x<=10,000 y<=10,000

		//Output Format
		//each line contains the table of the number x

		//Sample Input
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int i = x;
		
		while(i<=x*y) {
			System.out.println(i);
			i=i+x;
		}
		
	}

}
