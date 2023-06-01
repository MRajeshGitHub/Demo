package com.java8.map;


import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StudentMarks {

	public static void main(String[] args) {
		// Taking the list of marks :: every elements and add with +2 and print the student data..
		
		/*
		 * List<Student> marks= Arrays.asList(new Student(111, "Rajesh", "Hyderabad"),
		 * new Student(112, "Rahul", "Banglor"), new Student(113, "Ajay", "Chennai"),
		 * new Student(114, "Sanjay", "Kerala"), new Student(115, "Divya", "Mumbai"));
		 */
		List<Integer> marks=Arrays.asList(39,40,40,55,44,44,55,99,78,63,48,37);
		marks.stream().map(mark->mark+2).forEach(mark->System.out.println(mark));
		System.out.println("------------------------");
		marks.stream().map(mark->mark+"  soft").forEach(mark->System.out.println(mark));
		
		System.out.println("-----------------------");
		
	List<Integer>list=	marks.stream().filter(mark->mark%2==0).map(mark->mark*10).collect(Collectors.toList());
		System.out.println(list);
		System.out.println("------------------------");
		
		Set<Integer>setlist=	marks.stream().filter(mark->mark%2==0).map(mark->mark*10).collect(Collectors.toSet());
		System.out.println(setlist);
		
		
		
		
		
		

	}

}
