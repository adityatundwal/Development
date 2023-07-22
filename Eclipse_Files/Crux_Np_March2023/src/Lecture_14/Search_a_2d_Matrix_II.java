package Lecture_14;

public class Search_a_2d_Matrix_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]arr= {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int k = 5;
		System.out.println(Search(arr,k));
	}
	
	public static int Search(int[] [] arr, int k) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j]==k) {
					return 1;
				}
			}
		}
		
		return -1;
	}
	
	

}
