package Arrays;

import java.util.Scanner;

public class Reverse_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
		int []arr = new int[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter value of range you want to reverse:");
		System.out.println();
		int k = sc.nextInt();
		
		Reverserange(arr, k);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		

	}
	
	public static void Reverserange(int[]arr, int k ) {
		int n = arr.length;
		k =k%n;
		for (int j = 1; j < arr.length; j++) {
			int temp = arr[n-1];
			for (int i = n-2; i >= 0; i--) {
				arr[i+1] =arr[i];
			}
			arr[0] = temp;
		}
	}

}
