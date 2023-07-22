package Assignment_4;

import java.util.Scanner;

public class Kth_root_problem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		while(t-->0) {
			long n = sc.nextLong();
			long k = sc.nextLong();
			long lo = 1;
			long hi = n;
			long x = 0;
			while(lo<=hi) {
				long mid = (lo+hi)/2;
				if(Math.pow(mid, k)<=n) {
					x = mid;
					lo = mid+1;
				}
				else {
					hi = mid-1;
				}
			}
			System.out.println(x);
		}
	}

}
