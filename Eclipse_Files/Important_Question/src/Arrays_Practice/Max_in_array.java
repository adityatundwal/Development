package Arrays_Practice;

public class Max_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,1,17,5,8};
		System.out.println(MaxIN(arr));
		

	}

	private static int MaxIN(int[] arr) {
		// TODO Auto-generated method stub
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

}
