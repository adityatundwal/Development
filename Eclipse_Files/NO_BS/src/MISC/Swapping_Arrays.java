package MISC;

public class Swapping_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] other = { 100, 200, 300, 400, 500 };
		
		
		System.out.println(arr[0]+' '+other[0]);
		Swap(arr,0,4);
		System.out.println(arr[0]+' '+other[0]);
	}
	
	
	public static void Swap(int[] arr,int i, int j) {
		int a = arr[i];
		arr[i] = arr[j];
		arr[j] = a;
	}

}
