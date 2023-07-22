package Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class Rowwise_Sort_Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		
		  Scanner sc = new Scanner(System.in); 
		  int r = sc.nextInt(); int c =
		  sc.nextInt(); int[][] arr = new int[r][c]; 
		  for (int i = 0; i < arr.length;i++) {
			  for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= sc.nextInt();
			}
		  }
		
		Rowwise(arr);

	}

	private static void Rowwise(int[][] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				Arrays.sort(arr[i]);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
