package Bubble_Algorithms;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr = {1,212 ,243,651, 564,89,965,65};
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		Sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Sort(int []arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]  = arr[j+1];
					arr[j+1] = temp;
				}
			}	
		}
	}

}

