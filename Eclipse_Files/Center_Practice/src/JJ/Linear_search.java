package JJ;

import java.util.Scanner;

public class Linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		
		
		System.out.println(Search(arr,target));

	}

	private static int Search(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== target) {
				return i;
			}
		}
		return 0;
		
	}

}
