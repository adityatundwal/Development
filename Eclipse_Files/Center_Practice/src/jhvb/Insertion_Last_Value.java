package jhvb;

import java.util.Scanner;

public class Insertion_Last_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}
	
	
	

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			Insert(arr,i);
		}
		
	}




	private static void Insert(int[] arr,int j) {
		// TODO Auto-generated method stub
		int item = arr[j]; // here we are selecting the last element as item
		int i = j-1;
		while (i >= 0 && arr[i] >= item) {
			arr[i + 1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;

	}

}
