package Array_Algorithms;
import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr = {1,212 ,243,651, 564,89,965,65};
		System.out.println("available number 1,212 ,243,651, 564,89,965,65");
		int item = sc.nextInt();
		System.out.println(Search(arr,item));
	}
	
	public static int Search(int [] arr, int item) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==item) {
				return i;
			}
		}
		return 0;
	}

}
