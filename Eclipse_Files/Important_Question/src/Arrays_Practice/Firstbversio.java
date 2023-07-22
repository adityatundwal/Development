package Arrays_Practice;

import java.util.Scanner;

public class Firstbversio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(firstb(n));

	}

	private static int firstb(int n) {
		// TODO Auto-generated method stub
		
		int lo = 1;
		int hi = n;
		int ans = 0;
		while(lo<=hi) {
			int mid = lo+(hi-lo)/2;
			if(isBVersion(mid)== true) {
				ans = mid;
				hi = mid -1;
			}
			else {
				lo = mid+1;
			}
		}
		return ans;
		
	}

	private static boolean isBVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}

}
