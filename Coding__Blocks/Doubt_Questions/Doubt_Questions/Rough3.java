package Doubt_Questions;
import java.util.Scanner;
public class Rough3 {

	public static void main(String[] args) {Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	
	int row=1;
	int star=n-1;
	int space=0;
	
	while(row<=n*2-1)
	{
		System.out.print(row+" ");
		
		int i=1;
		while(i<=star)
		{
			System.out.print("*");
			i++;
		}

		
		int s=1;
		while(s<space&&row!=1)
		{
			System.out.print(" ");
			s++;
		}
		
		int m=1;
		while(m<=star)
		{
			System.out.print("*");
			m++;
		}
		
		row++;
		System.out.println();
		
		if(row<=n)
		{
			star--;
			space+=2;
		}
		else
		{
			star++;
			space-=2;
		}
		
		
		
	}}

}
