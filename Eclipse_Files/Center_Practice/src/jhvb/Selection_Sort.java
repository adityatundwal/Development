package jhvb;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {2,3,1,8,4,7,9,5,6};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		SelectSort(arr);
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		

	}

	private static void SelectSort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			int mini = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[mini]) {
					mini = j;
				}
			}
			
			if(mini!=i) {
				int temp = arr[i];
				arr[i] = arr[mini];
				arr[mini] = temp;
			}
		}
		
	}

}
