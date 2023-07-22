package Arrays;

public class Kadenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,5,6,1,7,8,9};
		System.out.println(Maxsum(arr));

	}
	
	
	public static int Maxsum(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			ans=Math.max(ans, sum);
			if(sum<0) {
				sum = 0;
			}
		}
		return ans;
	}

}
