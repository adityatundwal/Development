package Arrays_Practice;

public class MaxSubArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,5,6,7,1,9};
		System.out.println(Maxsub(arr));
	}

	private static int Maxsub(int[] arr) {
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
