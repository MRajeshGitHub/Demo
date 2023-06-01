package com.virtusa.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayAnoonymos {

	public static void main(String[] args) {
		// Array annonymous...using collection.....
		
		Emp e1= new Emp(101,"Rajesh");
		ArrayList<Emp> as= new ArrayList<Emp>(Collections.nCopies(10, e1));
		
		
		System.out.println("\n"+as);
		
		//for multiple copies of collection data....
		for(Emp ee:as) {
			System.out.println(ee.ename+"   "+ee.eid);
		}
		
	}

	

}
