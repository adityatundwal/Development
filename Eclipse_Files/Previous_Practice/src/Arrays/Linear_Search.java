package Arrays;

public class Linear_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
		System.out.println(search(arr,22));



	}
	
	public static int search(int[]arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return 0;
	}

}
