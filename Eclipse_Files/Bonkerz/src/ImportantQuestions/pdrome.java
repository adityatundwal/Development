package ImportantQuestions;

public class pdrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "RACECAR";
		System.out.println(pdrome(s));

	}

	private static boolean pdrome(String s) {
		// TODO Auto-generated method stub
		int i = 0;
		int j = s.length()-1;
		while(i<j) {
			if(s.charAt(i)==s.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
		
	}

}
