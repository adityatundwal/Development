package Lecture_31;
//package change karke import karna padta hai
import Lecture_30.Stack;

public class Dynamic_Stack extends Stack{
	@Override
	public void push(int item) throws Exception {
		if(super.isFull()) {
			//this will throw an error because the function is private
			//protected can be inherited in other classes out of package
			int [] newarr = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				newarr[i] = arr[i];
			}
			arr = newarr;
		}
		
		super.push(item);
	}
	

}
