package jj;

public class Bubble_St {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 12, 13, 14, 15, 19, 20, 1, 2, 3, 4, 8, 9, 10, 11, 16, 5, 6, 7, 17, 18 };
		Bub(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}

	private static void Bub(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

}
