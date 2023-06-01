package com.virtusa;

public class ArraySwap {

	public static void main(String[] args) {
		// Swap First and Last location elements in array
		
		int[] arr = {10, 20, 30, 40, 50};
        int n = arr.length;
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;
        System.out.println("Array elements : ");
        for (int x : arr)
        {
                    System.out.println(x);
        }
	
	}
}
