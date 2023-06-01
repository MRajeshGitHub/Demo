package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// Array list test by uaing collection framework
		
		ArrayList al= new ArrayList<>();
		
		al.add(10);
		al.add("Rajesh");
		al.add(null);
		al.add(10.5);
		al.add("Rajesh");
		System.out.println(al);
		System.out.println(al.toString());

	}

}
