package Arrays;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,5,6,7,1};
		
		sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		

	}

	private static void sort(int[] arr) {
		// TODO Auto-generated method 
		for (int i = 0; i < arr.length; i++) {
			insertsort(arr, i);
		}
		
	}

	private static void insertsort(int[] arr,int j) {
		// TODO Auto-generated method 

		int item = arr[j];
		int i = j-1;
		while(i>=0 && arr[i]>=item) {
			arr[i+1] = arr[i];
			i--;
		}
		i++;
		arr[i] = item;
		
	}

}
