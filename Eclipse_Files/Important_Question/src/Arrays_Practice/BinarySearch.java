package Arrays_Practice;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,4,5,6,7,1,9};
		System.out.println(Bsearch(arr,4));

	}

	private static int Bsearch(int[] arr, int item) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(arr[mid]==item) {
				return mid;
			}
			else if(arr[mid]<item) {
				lo = mid+1;
			}
			else {
				hi = mid -1;
			}
		}
		
		return -1;
	}

}
