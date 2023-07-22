package Lecture_19;

public class Board_Path {
	static int count = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		BoardPath(n, 0, "");
		System.out.println(count);

	}

	public static void BoardPath(int n, int curr, String ans) {
		if (curr == n) {
			System.out.println(ans);
			count++;
			return;
		}
		if (curr > n) {
			return;
		}

//		BoardPath(n, curr+1, ans+1);
//		BoardPath(n, curr+2, ans+2);
//		BoardPath(n, curr+3, ans+3);
		for (int dice = 1; dice < n; dice++) {
			BoardPath(n, curr + dice, ans + dice);
		}
	}

}