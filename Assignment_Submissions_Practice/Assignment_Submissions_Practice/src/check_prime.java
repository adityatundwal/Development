import java.lang.invoke.TypeDescriptor.OfMethod;
import java.util.Scanner;

public class check_prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i = 2;
        int count = 0;

        while(i<n){
            if(n%i==0){
                count++;
            }

            i++;

        }
        if(count==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }
    
}
