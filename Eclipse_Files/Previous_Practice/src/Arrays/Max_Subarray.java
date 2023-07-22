package Arrays;

public class Max_Subarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,65,4,6,2,62,65,1,513,};
		System.out.println(Max(arr));

	}

	private static int Max(int[] arr) {
		// TODO Auto-generated method stub
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = i; j < arr.length; j++) {
				sum = arr[j];
				ans = Math.max(ans,sum);
			}
		}
		return ans;

		
	
	}

}
