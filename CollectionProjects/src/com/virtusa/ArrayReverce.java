package com.virtusa;

public class ArrayReverce {

	public static void main(String[] args) {
		// Array reverce program...
	
		
		int ar[]= {10,203,0,40,50,60,70,80,44};
		int n=ar.length-1;
		for(int i=0;i<ar.length;i++)
		System.out.println("array element before reverce...."+ar[i]);

		System.out.println("==========================");
		for(int i=n;i>=0;i--) {
			System.out.println("array element after the reverce"+ar[i]);
		}
	}
	

}
