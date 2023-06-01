package com.virtusa;

public class ArrayPassArgument {

	public static void main(String[] args) {
		// The program passing the array as arguments....
		
		int ar[]= {10,20,30,40,50,60};
		for(int i=0;i<ar.length;i++)
		System.out.println("Array Elementa are   :"+ar[i]);
		System.out.println("ArrayPassArgument.main()"+ar.hashCode());
		ArrayPassArgument .modify(ar);

	}
	
	public static void modify(int a[]) {
		for(int i=0;i<a.length;i++) {
			a[i]=a[i]+5;
			System.out.println("new array elements is:"+a[i]);
			System.out.println("ArrayPassArgument.modify()"+a.hashCode());
		}
	}

}
