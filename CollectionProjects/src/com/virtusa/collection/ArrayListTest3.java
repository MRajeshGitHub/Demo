package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int []a= {10,20,30,40,50};
		for(int aa : a) {
			System.out.println(aa);
		}
		
		ArrayList<Emp>  al= new ArrayList<Emp>();
		al.add(new Emp(101,"shubjam"));
		al.add(new Emp(102,"juli"));
		//System.out.println(al);
		System.out.println("============");
		for(Emp e:al) {
			System.out.println(e.eid+"   "+e.ename);
		}
		
		ArrayList <Emp> aa= new ArrayList<Emp>(al);
		System.out.println(aa.add(new Emp(105,"ahaty")));
		for(Emp ab:aa) {
			System.out.println(ab.ename+"  "+ab.eid);
		}
	}

}
