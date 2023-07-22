package leetcode_self;

import java.util.Scanner;

public class check_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		//System.out.println(Checkpalindrome(n));
		String s = String.valueOf(n);
			
	}

	private static boolean Checkpalindrome(String s) {
		int i = 0;
		int j = s.length();
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
