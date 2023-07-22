package Arrays_Practice;

public class Array_Reversing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,1,17,5,8};
		Reverse(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}

	private static void Reverse(int[] arr) {
		// TODO Auto-generated method stub
		
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

}
