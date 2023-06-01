package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayObjTest {

	public static void main(String[] args) {
		// Array list collecgion using objest data details...
		
		ArrayList al= new ArrayList();
		al.add(new Emp(111,"Rajesh"));
		al.add(new Student(101,"shubham"));
		al.add(10);
		al.add("ratan");
		al.add(null);
		System.out.println(al);
		System.out.println(al.toString());
		System.out.println(al.size());
		System.out.println(al.isEmpty());
		System.out.println(al.remove(2));
		//System.out.println(al.clear());
		System.out.println("==========================");
		
		for(Object o:al) {
			if(o instanceof Emp) {
				Emp e=(Emp)o;
				System.out.println(e.ename+"  "+e.eid);
			}
			if( o instanceof Student) {
				Student s= (Student)o;
				System.out.println(s.sid+"  "+s.sname);
			}
			if(o instanceof Integer) {
				System.out.println(o);
			}
			if(o instanceof String) {
				System.out.println(o);
			}
			if(o==null) {
				System.out.println(o);
			}
		}

	}

}
