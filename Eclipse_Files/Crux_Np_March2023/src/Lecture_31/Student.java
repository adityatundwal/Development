package Lecture_31;

public class Student {

	String name = "student1";
	int age = 23;
	//@Override checks if the value is correct or not
	@Override
	public String toString() {
		return this.name + " " + this.age;
	}

}
