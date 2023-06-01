package com.java8.map;

import java.util.Arrays;
import java.util.List;

public class MapEmpObj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Emp> emp=Arrays.asList(new Emp(123, "Rajesh", 10000.0),
				new Emp(124, "Ajay", 20000.0),
				new Emp(125, "Pankaj", 30000.0),
				new Emp(126, "Praksh", 40000.0));
		
		emp.stream().map(emps->emps.getEname()+" "+"Kumar").forEach(emp1->System.out.println(emp1));
		System.out.println("==================");
		
		emp.stream().filter(emp1->emp1.getEsal()>25000).map(emp2->{emp2.setEsal(emp2.getEsal()+100);return emp;}).forEach(emp3->System.out.println(emp3));
		
		
		
		

	}

}
