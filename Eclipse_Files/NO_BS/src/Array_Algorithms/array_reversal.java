package Array_Algorithms;

import java.util.Iterator;

public class array_reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,212 ,243,651, 564,89,965,65};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Reverse(int[] arr) {
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}

}
