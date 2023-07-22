package jhvb;

public class Reversing_array_range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {7,1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		reverse(arr, 5, 9);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" "); 
		}

	}

	private static void reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		
	}

}
