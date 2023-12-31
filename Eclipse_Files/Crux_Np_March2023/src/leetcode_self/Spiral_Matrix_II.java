package leetcode_self;
import java.util.*;

public class Spiral_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int count = 1;
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = count;
				count++;
			}
		}
		
		Spiral(arr);
//
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			
//			System.out.println();
//		}

	}
	
	public static void Spiral(int[][] arr) {
		int minr = 0;
		int maxr = arr.length - 1;
		int minc = 0;
		int maxc = arr[0].length - 1;
		int te = arr.length * arr[0].length;
		int count = 0;
		while (minr <= maxr && minc <= maxc) {
			for (int i = minc; i <= maxc && count < te; i++) {
				System.out.print(arr[minr][i] + " ");
				count++;
			}
			minr++;
			for (int i = minr; i <= maxr && count < te; i++) {
				System.out.print(arr[i][maxc] + " ");
				count++;
			}
			maxc--;
			for (int i = maxc; i >= minc && count < te; i--) {
				System.out.print(arr[maxr][i] + " ");
				count++;
			}
			maxr--;

			for (int i = maxr; i >= minr && count < te; i--) {
				System.out.print(arr[i][minc] + " ");
				count++;
			}
			minc++;
		}
	}

}
