package Array_Algorithms;

public class max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,212 ,243,651, 564,89,965,65};
		System.out.print(max(arr));
		
		}
	
	public static int max(int[] arr) {
		int max = arr[0];				//Taking the value of arr from 0th index in this instance 1
		for (int i = 0; i < arr.length; i++) {		//iterating over array
			if(max<arr[i]) {		//Comparing if the value is greater than arrays initial value
				max = arr[i];		//adding the bigger value into the initial value until it cannot be added
			}	
		}
		return max;		//returning value of max
	}
}
