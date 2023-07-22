package Lecture_13;

public class Kth_Root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int n = 126;
		System.out.println(Kthroot(k,n));
	

	}
	
	
	public static int Kthroot(int k, int n) {
		int lo = 1;
		int hi = n;
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(Math.pow(mid, k)<=n){
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid -1;
			}
		}
		return ans;
	}
}
