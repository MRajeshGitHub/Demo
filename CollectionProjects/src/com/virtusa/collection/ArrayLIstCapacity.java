package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayLIstCapacity {

	public static void main(String[] args) {
		//  Array list capacity....
		
		ArrayList<Integer> ai= new ArrayList<Integer>(5);
		for(int i=0; i<10;i++) {
			ai.add(i);
			System.out.println(i);
			System.out.println(ai.size());
			System.out.println(ai.hashCode());
		}
		

	}

}
