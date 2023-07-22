package Lecture_1;

public class grade_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int Marks = 67;
		
		if(Marks>=75) {
			System.out.println("A+");
		}
		else if(65<=Marks && Marks<75){
			
			System.out.println("A");
		}
		else if(55<= Marks && Marks<65) {
			System.out.println("B");
		}
		else if(45<= Marks && Marks<45) {
			System.out.println("Passed");
		}
		else {
			System.out.println("failed");
		}
	}

}
