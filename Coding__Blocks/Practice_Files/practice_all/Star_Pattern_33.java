package practice_all;
import java.util.Scanner;

public class Star_Pattern_33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int row=1;
		int area=1;
		int space=n-1;
		int num=n;
		
		
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			while(j<=area) {
				System.out.print(num%10+" ");
				if(j>area/2) {
					num--;
					}
				else {
					num++;
					}
				j++;
			}
			System.out.println();
			space--;
			area+=2;
			row++;
			
		}

	}

}