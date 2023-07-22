package Arrays_Practice;

import java.util.Iterator;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {10,20,30,40,50,60,70,80,90,100};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Swappes(arr, 0 , 5);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void Swappes(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
