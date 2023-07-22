package leetcode_self;

import java.util.Scanner;

public class Valid_Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(checkpalindrome(str));

	}
	

	private static boolean checkpalindrome(String str) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = str.length() - 1;
		while (i < j) {
			while(i<j && !Character.isLetterOrDigit(str.charAt(i))) {
				i++;
			}
			while(i<j && !Character.isLetterOrDigit(str.charAt(j))) {
				j--;
			}
			if (Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}


}
