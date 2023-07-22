package jhvb;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {7,1,2,3,4,5,6,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Bubble(arr);
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}	
		
		

	}

	private static void Bubble(int[] arr) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
