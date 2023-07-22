package Arrays_Practice;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,1,17,5,8};
		int item = 1;
		System.out.println(SearchQ(arr,item));

	}

	private static int SearchQ(int[] arr, int item) {
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		
		return 0;
	}

}
