package Lecture_1;

public class count_1_to_10_while_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 10;
		int i = 1;
		
		while(i <= n) {			//while i is less than n print n and increment the 
								//			value of n by one every time loop runs
			System.out.print(i);
			i+=1;
		}
		
		for(int j = 1; j<=n; j++) {			//same approach but faster time complexity
			System.out.println(j);
			
		}

	}

}
