package Arrays;

import java.util.Scanner;

public class Max_n_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();					
		int [] arr = new int[n];					/*this whole line is used to take input in an array*/
		for (int i = 0; i < arr.length; i++) {
			arr[i] =  sc.nextInt();
		}
		System.out.println(Max(arr));

	}
	
	
	public static int Max(int[]arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
