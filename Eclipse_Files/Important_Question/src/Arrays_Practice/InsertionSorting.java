package Arrays_Practice;

public class InsertionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,5,6,7,1,9};
		
		sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			Insertion(arr,i);
		}
	}

	private static void Insertion(int[] arr, int j) {
		// TODO Auto-generated method stub
		
		int item = arr[j];
		int i = j-1;
		while(i>=0 && arr[i]>= item) {
			arr[i+1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;
		
	}
	
	

}
