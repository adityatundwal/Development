package Lecture_31;

import Lecture_30.Queue;

public class Dynamic_Queue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int []newarr = new int[2*arr.length];
			for (int i = 0; i < arr.length; i++) {
				int idx = (front+i)%arr.length;
				newarr[i] = arr[idx];
			}
			arr=newarr;
			front= 0;
		}
		super.Enqueue(item);

	}

}
