 package Arrays;

public class Reversing_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int []arr = {10,20,30,40,50};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		Reverse(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

	private static void Reverse(int[] arr) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = arr.length-1;
		
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j]  = temp;
			i++;
			j--;
		}
	}

}
