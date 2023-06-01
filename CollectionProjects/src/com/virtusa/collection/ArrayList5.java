package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayList5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Emp e= new Emp(101, "Rajsh");
		Emp e1= new Emp(102, "Rajshaaa");
		Emp e2= new Emp(1013, "Rajshfff");
		Emp e3= new Emp(104, "Rajggggsh");
		Emp e4= new Emp(105, "Rajshgfg");
				
		ArrayList<Emp> ee= new ArrayList<Emp>();
		ee.add(e);
		ee.add(e1);
		ee.add(e2);
		ArrayList<Emp> ee2= new ArrayList<Emp>();
		ee2.add(e3);
		ee2.add(e4);
		System.out.println(ee2.contains(ee));
		System.out.println(ee2.containsAll(ee));
		
		
	
		

	}

}
