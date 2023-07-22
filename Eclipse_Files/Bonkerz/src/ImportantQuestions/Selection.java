package ImportantQuestions;

public class Selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {2,3,1,4,5,6,9,8,41,31,13,51,66,76};
		Selection_Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		
		

	}

	private static void Selection_Sort(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			int minindex = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minindex]) {
					minindex = j;
				}
			}
			
			if(minindex != i) {
				int temp = arr[i];
				arr[i] = arr[minindex];
				arr[minindex] = temp;
			}
		}
		
	}

}
