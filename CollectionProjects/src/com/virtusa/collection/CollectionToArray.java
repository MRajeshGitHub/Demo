package com.virtusa.collection;

import java.util.ArrayList;

public class CollectionToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		ArrayList<String> ss= new ArrayList<String>();
		ss.add("Raju");
		ss.add("Prakash");
		ss.add("salu");
		ss.add("pankaj");
		ss.add("sweety");
		System.out.println(ss);
		
		
		
		String [] as= new String[ss.size()];
		ss.toArray(as);
		for(String s1:as) {
			System.out.println();
		}
		
		
	ArrayList al= new ArrayList();
	al.add(10);
	al.add("Ratqan");
	
	System.out.println(al);
	
	System.out.println("============");
	Object []o= al.toArray();
	for(Object oo:o) {
		System.out.println(oo);
	}
		
		

	}

}
