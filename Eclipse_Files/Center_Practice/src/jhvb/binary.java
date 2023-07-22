package jhvb;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1,3,4,6,7,9,11,13,14,15,18};
		System.out.println(Bin_Search(arr, 15));
	}

	private static int Bin_Search(int[] arr, int item) {
		// TODO Auto-generated method stub

		int lo = 0;
		int hi = arr.length-1;
		int mid = (lo + hi) / 2;
		while (lo <= hi) {
			if (arr[mid] == item) {
				return mid;
			} else if (arr[mid] < item) {
				lo = mid + 1;
			} else {
				hi = mid - 1;
			}
		}
		return -1;

	}

}
