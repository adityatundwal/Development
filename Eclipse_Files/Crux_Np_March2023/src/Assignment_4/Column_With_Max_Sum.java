package Assignment_4;

import java.util.Iterator;
import java.util.Scanner;

public class Column_With_Max_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[][]arr = {
				{90,40,1,3,39,59,90}, 
				{48,72,67,32,73,19,27},
				{22,37,47,68,1,5,55},
				{81,5,39,53,38,86,21},
				{1,32,7,44,2,65,47}, 
				{68,13,24,28,69,81,43}, 
				{16,34,67,3,82,26,35}};
//		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int [][]arr = new int[n][n];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}

		Maxcolsum(arr);

	}

	private static void Maxcolsum(int[][] arr) {
		int maxsum = 0;
		int idx = 1;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[j][i];
			}
			if (sum > maxsum) {
				maxsum = sum;
				idx = i;
			}
		}

		System.out.println(maxsum);
		System.out.println(idx);
	}

}
