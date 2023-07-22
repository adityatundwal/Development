package jhvb;

import java.util.Scanner;

public class Kadanes_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(Kadenes(arr));

	}

	private static int Kadenes(int[] arr) {
		// TODO Auto-generated method stub
		
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if(sum<0) {
				sum = 0;
			}
		}
		
		return sum;
		
	}
	

}
