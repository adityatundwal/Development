package leetcode_self;

import java.util.Scanner;

public class remove_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		removedupe(s); 
		System.out.println(s);
			

	}

	private static String removedupe(String s) {
		// TODO Auto-generated method stub
		String newS = "";
		for (int i = 0; i < s.length(); i++) {
			char ch= s.charAt(i);
			if(newS.indexOf(i)==-1) {
				newS+=ch;
			}
		}
		return newS;
	}

}
