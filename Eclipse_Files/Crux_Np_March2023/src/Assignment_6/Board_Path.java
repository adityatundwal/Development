package Assignment_6;

import java.util.Scanner;

public class Board_Path {
	static int count = 0;
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Boardpath(N, M, 0, "");
		System.out.println();
		System.out.println(count);
	}

	public static void Boardpath(int n, int m, int curr, String ans) {
		// TODO Auto-generated method stub
		if (curr == n) {
			System.out.print(ans+" ");
			count++;
			return;
		}
		if (curr >= n) {
//			count+=1;
			return;

		}

		for (int dice = 1; dice <=m; dice++) {
			Boardpath(n, m, curr + dice, ans + dice);
			
		}

	}

}
