package Assignment_4;

import java.util.Scanner;

public class Boolean_Matrix_Right {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][]arr = new int [m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		}
		
		modifymatrix(arr,m,n);
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	private static void modifymatrix(int[][] arr, int m, int n) {
		// TODO Auto-generated method stub
		int []row  = new int[m];
		int []col = new int[n];
		
		
//		for (int i = 0; i < row.length; i++) {
//			row[i] = 0;
//		}
//		
//		for (int i = 0; i < col.length; i++) {
//			col[i] = 0;
//		}
		
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if(arr[i][j] == 1) {
					row[i] = 1;
					col[j] = 1;
				}
			}
		}
		
		for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if(row[i]==1 || col[j] ==1) {
					arr[i][j]=1;
				}
			}
		}
	}

}
