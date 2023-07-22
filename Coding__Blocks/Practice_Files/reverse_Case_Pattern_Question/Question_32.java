package reverse_Case_Pattern_Question;
import java.util.Scanner;
public class Question_32 {

	public static void main(String[] args) {
		    
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    
		    int row = 1;
		    int star = 1;
		    int space = n-1;
		    int count = n;
		    
		    while(row<=n){
		        int i = 1;
		        while(i<=space){
		            System.out.print("  ");
		            i++;
		        }
		        int k = 1;
		        while(k <= star){
		            System.out.println(count);
		            k++;
		        }
		        count--;
		        star++;
		        space--;
		        row++;
		        System.out.println();
		        
		    }
		}}