package Assignment_4;
import java.util.Scanner;

public class Row_Wise_AntiClockwise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		  Scanner sc = new Scanner(System.in);
//		  int n = sc.nextInt();
//		  int m =sc.nextInt(); 
//		  int [][]arr = new int [n][m];
//		  
//		  for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr[i].length;
//		  j++) { arr[i][j] = sc.nextInt(); } }
//		 
		int[][] arr = { {1,2,3,4},
						{5,6,7,8},
						{9,10,11,12},
						{13,14,15,16}};
		
		
		spiralanticlock(arr);

	}
 
	private static void spiralanticlock(int[][] arr) {
		int minr = 0;
		int minc = 0;
		
		int maxr = arr.length-1;
		int maxc = arr[0].length-1;
		
		int te = arr.length * arr[0].length;
		int count = 0;
		
		
		while(count<te) {
			for (int i = minr,j = minc ; i <= maxr && count<te; i++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			minc++;
			
			for (int i = maxr, j = minc; j <= maxc && count<te; j++) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxr--;
			
			for (int i = maxr, j=maxc; i >= minr  && count<te; i--) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			maxc--;
			
			for (int i = minr,j = maxc ; j >= minc  && count<te; j--) {
				System.out.print(arr[i][j]+" ");
				count++;
			}
			minr++;
		}
		System.out.println("END");
	}

}
