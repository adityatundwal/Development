package Array_Algorithms;

public class swapping_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {1,212 ,243,651, 564,89,965,65};
		System.out.println(arr[3]+"  "+arr[6]);
		Swap(arr, 3 , 6);
		System.out.println(arr[3]+"  "+arr[6]);
	}
	
	public static void Swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
