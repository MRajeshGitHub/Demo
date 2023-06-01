package com.virtusa.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLIstSwap {

	public static void main(String[] args) {
		// swapping the data using arraay list index based...
		
		ArrayList<String> al= new ArrayList<String>();
		al.add("Rajesh");
		al.add("shubham");
		al.add("juli");
		al.add("raqju");
		al.add("pk");
		System.out.println(al);
		
		System.out.println("==================");
		Collections.swap(al, 1, 3);
		System.out.println(al);
		
		ArrayList<String> all= new ArrayList<String>(al.subList(2, 4));
		System.out.println(all);
		

	}

}
