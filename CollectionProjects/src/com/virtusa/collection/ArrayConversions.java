package com.virtusa.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayConversions {

	public static void main(String[] args) {
		// Array list data to normal arraays....
		
		ArrayList<String> ss= new ArrayList<String>();
		ss.add("ajasy");
		ss.add("vjasy");
		ss.add("sjasy");
		ss.add("rjasy");
		ss.add("sajasy");
		System.out.println(ss);
		
		String []sr= new String[ss.size()];
		ss.toArray();
		for(String str:ss) {
			System.out.println(str);
		}
		//normal array data to collection data
			String []sp= {"raju","mona","viru"};
			for(String sa:sp)
			System.out.println(sa);
			
			ArrayList<String> arl=new ArrayList<String>(Arrays.asList(sp));
			for(String rr:arl) {
				System.out.println(rr);
			}
			
			
		
	}

}
