package com.java8.sorting;

import java.util.Arrays;
import java.util.List;

public class EmpDataSort {

	public static void main(String[] args) {
		// Employee data sorting using java 8 features
		
		List<Emp> emps=Arrays.asList(new Emp(101, "Rajesh", 10000),
																 new Emp(102, "Rohit", 20000),
																 new Emp(103, "Rajan", 30000),
																 new Emp(104, "Sanjit", 40000),
																 new Emp(105, "varaprasad", 50000),
																 new Emp(106, "Anand", 60000));
		
		//sort the emp data using eid;;;
		
				emps.sort((e1,e2)->e1.ename.compareTo(e2.ename));
				emps.forEach(emp->System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
				
				System.out.println("+++++++++");
				//emps.sort((e1,e2)->e1.eid.compareTo(e2.eid));
		System.out.println("=======================");
		//sort based on stream
		//emps.stream().filter(emp->emp!=null).filter(emp->emp<50000).sorted((ee1,ee2)->ee1.esal.compareTo(ee2.esal)).forEach(null);

	}

}
