package Assignment_6;

import java.util.Scanner;

public class Last_Index {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int M = sc.nextInt();
		int i = arr.length;
		System.out.println(li(arr,arr.length-1,M));
	}

	private static int li(int[] arr,int i, int m) {
		// TODO Auto-generated method stub
		
		if(i<0) {
			return -1;
		}
		if(arr[i]==m) {
			return i;
		}
		return li(arr,i-1,m);
		
		
	}

}
