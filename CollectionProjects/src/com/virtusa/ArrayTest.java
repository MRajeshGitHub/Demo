package com.virtusa;

public class ArrayTest {

	public static void main(String[] args) {
		// Array elements print as it is.....
		
		int arr[]= {00,20,30,40,50,60,77};
		for(int i=0; i<arr.length;i++) {
			System.out.println("array elements are  :"+arr[i]);
			
			System.out.println("-----------------------------------");
			System.out.println("using for each loop....!");
			for(int ar:arr) {
				System.out.println(ar);
			}
		}

	}

}
