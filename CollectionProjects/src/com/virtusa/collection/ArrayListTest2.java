package com.virtusa.collection;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al= new ArrayList();
		al.add(new Emp(123, "Sanjit"));
		al.add(new Student(124,"Divya"));
		System.out.println(al.toString());
		System.out.println("====================");
		
		Student s= (Student)al.get(1);
		System.out.println(s.sid+"  "+s.sname);
		Emp e= (Emp)al.get(0);
		System.out.println(e.ename+"   "+e.eid);
		
		System.out.println("===============");
		
		Object o= al.get(0);
		
		if(o instanceof Emp) {
			System.out.println(e.eid+"  "+e.ename);
		}
		if( o instanceof Student) {
			System.out.println(s.sid+"  "+s.sname);
		}
		
		
		
		

	}

}
