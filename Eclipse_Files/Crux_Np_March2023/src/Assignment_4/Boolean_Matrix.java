package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Boolean_Matrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int [][]arr = new int[m][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		Boolean(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]+" ");
			}
		}
	}
	
	
	public static void Boolean(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j]==0) {
					arr[i][0] = 1;
				}
				if(j!=0) {
					arr[0][j] =1;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[i][j]!=1) {
					if(arr[i][0]==1 || arr[0][j]==1) {
						arr[i][j] = 1;
					}
				}
			}
		}
	}

}
