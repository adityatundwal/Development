package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class aggresive_Cows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int t = sc.nextInt();
		while(t>0) {
			
			int nos = sc.nextInt();
			int noc = sc.nextInt();
			
			int [] stall = new int[nos];
			for (int i = 0; i < stall.length; i++) {
				stall[i] = sc.nextInt();
			}
			Arrays.sort(stall);
			System.out.println(MaxDistance(stall,noc));
		}

	}

	private static int MaxDistance(int[] stall, int noc) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = stall[stall.length-1];
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(issafe(stall,noc,mid)==true) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
		
	}

	private static boolean issafe(int[] stall, int noc, int mid) {
		// TODO Auto-generated method stub
		int pos = stall[0];
		int cow = 1;
		for (int i = 0; i < stall.length; i++) {
			pos = stall[i];
			cow++;
		}
		if(noc == cow) {
			return true;
		}
	return false;

}

}
