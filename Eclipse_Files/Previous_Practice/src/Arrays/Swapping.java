package Arrays;

public class Swapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {10,20,30,40,50};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		Swap(arr,0,1);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}

	private static void Swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
