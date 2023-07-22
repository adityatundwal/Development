package Hacker_Blocks_questionnaire_1;
import java.util.Scanner;
public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int y = sc.nextInt();
		int res = s;
		
		while(res<=s*y) {
			System.out.println(res);
			res = res+s;
		}

	}

}
