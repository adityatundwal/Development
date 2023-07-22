package leetcode_self;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		// TODO Auto-generated method
		int []arr = {1,8,6,2,5,4,8,3,7};
		System.out.println(Maxvol(arr));

	}

	private static int Maxvol(int[] arr) {
		// TODO Auto-generated method stub
		int []left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int []right = new int[arr.length];
		right[arr.length-1] = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		int leftmax = 0;
		for (int i = 0; i < left.length; i++) {
			if(leftmax<left[i]) {
				leftmax = left[i];
			}
		}
		
		int rightmax = 0;
		
		int val = Math.min(leftmax, rightmax);
		int volume = val*2;
		
		return volume;
		
	}

}
