package jj;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int target = 15;
		
		System.out.println(Search(arr,target));

	}

	private static int Search(int[] arr, int target) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]== target) {
				return i;
			}
		}
		return 0;
	}

}
