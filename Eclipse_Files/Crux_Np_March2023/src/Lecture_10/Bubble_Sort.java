package Lecture_10;

import java.util.Iterator;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {5 , 3 , 4 , 2 , 1};
		Sort(arr);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+" ");
		}

	}
	
	public static void Sort(int []arr) {
		for (int i = 1; i < arr.length; i++) { //No OF TURn
			
			//working
			for (int j = 0; j < arr.length-i; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j + 1] = temp;
				}
				
			}
			
		}
	}

}
