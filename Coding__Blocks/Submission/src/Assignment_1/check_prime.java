package Assignment_1;
import java.util.Scanner;
public class check_prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if(n%i==0) {
			System.out.println(i+"Is prime");
			}
			else {
				System.out.println(i+"Not prime");
			}
			i++;
		}

	}

}


/*
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		//if number is divisble 
		int i = 2;
		int count = 0;
		
		while(i<n) {
			if (n%i==0) {
				count++;	
			}
			i++;
		}
		if (count==0) {
			System.out.println("Prime");
		}
		else {
			System.out.print("Not Prime");
		}

	}*/
