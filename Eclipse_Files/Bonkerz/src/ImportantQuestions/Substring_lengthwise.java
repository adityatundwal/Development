package ImportantQuestions;

public class Substring_lengthwise {
	
	public static void main(String[] args) {
		String s = "4718236";
		Substr(s);
		
	}

	private static void Substr(String s) {
		// TODO Auto-generated method stub
		for (int len = 0; len < s.length(); len++) {
			for (int j = len; j < s.length(); j++) {
				int i = j-len;
				System.out.println(s.substring(i,j)+" ");
			}
			
		}
		
	}

}
