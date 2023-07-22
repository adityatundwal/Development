package leetcode_self;

public class most_water {
	public static void main(String[] args) {
		//int []arr = {1,8,6,2,5,4,8,3,7};
		int []arr = {1,1};
		System.out.println(Maxvol(arr));
	}

	private static int Maxvol(int[] arr) {
		// TODO Auto-generated method stub
		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>largest) {
				secondlargest = largest;
				largest = arr[i];
			}
			else if(arr[i]>secondlargest && arr[i]!= largest) {
				secondlargest = arr[i];
			}
					}
		
		int val = Math.min(largest, secondlargest);
		int ans = val*val;
		return ans;
	}

}
