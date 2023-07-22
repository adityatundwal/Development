package Lecture_1;
import java.util.Scanner;

public class Max_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a>=b && a>=c) {
			System.out.println(a+"is the maximum");
		}
		else if(b>=a && b>=c){
			System.out.println(b+"is the maximum");
		}
		else {
			System.out.println(c+"is the greatest");
		}
		
		

	}

}
