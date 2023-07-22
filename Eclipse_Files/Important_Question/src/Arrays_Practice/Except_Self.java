package Arrays_Practice;

public class Except_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,2,3,4,5,6,7,8,9};
		int[] ans = productes(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
			

	}

	private static int []productes(int[] arr) {
		// TODO Auto-generated method stub
		int[] left = new int[arr.length];
		left[0]  = 1;
		for (int i = 1; i < left.length; i++) {
			left[i] = left[i-1]*arr[i-1];
		}
		int []right = new int[arr.length];
		right[arr.length-1] = 1;
		for (int i = right.length-2; i >= 0 ; i--) {
			right[i] = right[i+1]*arr[i+1];
		}
		for (int i = 0; i < right.length; i++) {
			arr[i] = right[i]*left[i];
		}
		
		return arr;
	}

}
