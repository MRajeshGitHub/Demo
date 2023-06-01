package com.virtusa;

public class ArrayLargeElement {

	public static void main(String[] args) {
		// Teh largest element of the given array....
		
		int []arr= {10,14,27,6,97,44,56};
		int larg=arr[0];
		System.out.println("largest element of the array....");
		
		for(int i=1;i<arr.length;i++) {
				
				if(arr[i]>larg) {
					larg=arr[i];
				}
		}
				System.out.println("the largest elements of the given array..is :"+larg);
	}

}
