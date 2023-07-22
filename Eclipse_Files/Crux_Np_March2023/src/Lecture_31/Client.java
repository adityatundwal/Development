package Lecture_31;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * First Case 
		 * P obj = new P(); this will run normally
		 */

		// Second Case
//
//		P obj = new C();
//		System.out.println(obj.d);
//		System.out.println(obj.d1);

		/*We will type case the value of object in order
		to access the values of child class*/
		/*System.out.println(((C)(obj)).d);

		System.out.println(((C)(obj)).d2);
		
		((C)(obj)).fun2();
		obj.fun();
		obj.fun1();*/
		
		
		//Third Case
		
		//Compile time error is better than runtime error
		
//		C obj = new P();
//		System.out.println(obj.);

		
		//Fourth Case
		
		C obj = new C();
		System.out.println(obj.d);
		System.out.println(obj.d1);
		System.out.println(obj.d2);
		obj.fun();
		obj.fun1();
		obj.fun2();
		
		
		//Function me jise new kiya hai wohi work karega
		//for example fun() here
		
		/*This throws an error because parent is 
		Trying to access the value of child
		The reason this one is throwing an error
		because the compiler cannot access the values
		of child class
		System.out.println(obj.d2);*/
		
		
		
		

//		System.out.println(obj.d);
//		System.out.println(obj.d1);
//		
//		obj.fun();
//		obj.fun1();

	}

}
