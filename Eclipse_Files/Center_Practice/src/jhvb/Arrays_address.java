package jhvb;

public class Arrays_address {
	public static void main(String[] args) {
		int []arr = new int[5];
		System.out.println(arr);			//this will return the address of the array
		System.out.println(arr[0]);			/* these will return the values inside the array*/
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		arr[0] = 10;		//this will feed the data inside the array
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		
		System.out.println(arr[0]);			/* these will return the values inside the array*/
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}
 